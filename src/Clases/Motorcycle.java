/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author user
 */
public class Motorcycle {
    private int codigo;
    public int generarCodigo()
 {
  int codigoMotorcycle=(int) (Math.random()*9999);
  return codigoMotorcycle;
 }
 public int getCodigo() {
  return codigo;
 }
 public void setCodigo(int codigo) {
  this.codigo = codigo;
 }
 public void codigoVehicle() {
  JOptionPane.showMessageDialog(null,"El Codigo del Vehiculo es : "+getCodigo());
 }
}
