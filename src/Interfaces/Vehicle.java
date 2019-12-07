/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author user
 */
public class Vehicle {
    private int codigo;
    public int generarCodigo()
 {
  int codigoCar=(int) (Math.random()*9999);
  return codigoCar;
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
 