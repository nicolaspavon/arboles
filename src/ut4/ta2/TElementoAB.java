/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut4.ta2;

/**
 *
 * @author nico
 */
public class TElementoAB<T> implements IElementoAB{
    Comparable etiqueta;
    TElementoAB<T> hijoIzq;
    TElementoAB<T> hijoDer;
    Object datos;
    
    public TElementoAB(Comparable UnaEtiquetaqueta, Object unosDatos){
        this.etiqueta = UnaEtiquetaqueta;
        this.datos = unosDatos;
    }
    
    public boolean insertar(TElementoAB unElemento, Integer numerito){
        numerito++;
        if (etiqueta == unElemento.etiqueta){
            System.out.println("Elementos recorridos: " + numerito);
            return true;
        }
        if (unElemento.etiqueta.compareTo(etiqueta) < 0){
            if (hijoIzq == null){
                hijoIzq = unElemento;
                System.out.println("Elementos recorridos: " + numerito);
                return true;
            }else{
                hijoIzq.insertar(unElemento, numerito);
            }
        }else{
            if(hijoDer ==  null){
                hijoDer = unElemento;
                System.out.println("Elementos recorridos: " + numerito);
                return true;
            }else{
                hijoDer.insertar(unElemento, numerito);
            }
        }
        return false;
    }

    @Override
    public Comparable getEtiqueta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TElementoAB getHijoIzq() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TElementoAB getHijoDer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setHijoIzq(TElementoAB elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setHijoDer(TElementoAB elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TElementoAB buscar(Comparable UnaEtiquetaqueta) {
        if (UnaEtiquetaqueta.compareTo(etiqueta) == 0) {
            return this;
        } else {
            if (UnaEtiquetaqueta.compareTo(etiqueta) < 0) {
                if (hijoIzq != null) {
                    return hijoIzq.buscar(UnaEtiquetaqueta);
                } else {
                    return null;
                }
            } else {
                if (UnaEtiquetaqueta.compareTo(etiqueta) > 0) {
                    if (hijoDer != null) {
                        return hijoDer.buscar(UnaEtiquetaqueta);
                    } else {
                        return null;
                    }
                } else {
                    return null;
                }
            }
        }
    }

    @Override
    public boolean insertar(TElementoAB elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String preOrden() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String inOrden() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String postOrden() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TElementoAB eliminar(Comparable unaEtiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
