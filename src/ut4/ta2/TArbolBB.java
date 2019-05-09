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
public class TArbolBB<T> implements IArbolBB{
    
    private TElementoAB<T> raiz;

    public TArbolBB() {
        raiz = null;
    }

    @Override
    public TElementoAB buscar(Comparable unaEtiqueta) {
        if (raiz == null){
            return null;
        }else{
            return raiz.buscar(unaEtiqueta);           
        }
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
    public void eliminar(Comparable unaEtiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insertar(TElementoAB unElemento) {
        Integer numerito = 0;
        if (raiz == null){
            raiz = unElemento;
            return true;
        }else{
            return raiz.insertar(unElemento,numerito);
        }           

    }
    
}
