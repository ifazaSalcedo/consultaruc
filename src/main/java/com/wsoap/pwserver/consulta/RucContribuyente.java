//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.02.26 a las 12:33:20 PM PYST 
//


package com.wsoap.pwserver.consulta;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para rucContribuyente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="rucContribuyente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ruc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="apellido" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dv" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rucAnterior" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rucEstado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rucContribuyente", propOrder = {
    "ruc",
    "nombre",
    "apellido",
    "dv",
    "rucAnterior",
    "rucEstado"
})
public class RucContribuyente {

    @XmlElement(required = true)
    protected String ruc;
    @XmlElement(required = true)
    protected String nombre;
    @XmlElement(required = true)
    protected String apellido;
    @XmlElement(required = true)
    protected String dv;
    @XmlElement(required = true)
    protected String rucAnterior;
    @XmlElement(required = true)
    protected String rucEstado;

    /**
     * Obtiene el valor de la propiedad ruc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuc() {
        return ruc;
    }

    /**
     * Define el valor de la propiedad ruc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuc(String value) {
        this.ruc = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad apellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Define el valor de la propiedad apellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellido(String value) {
        this.apellido = value;
    }

    /**
     * Obtiene el valor de la propiedad dv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDv() {
        return dv;
    }

    /**
     * Define el valor de la propiedad dv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDv(String value) {
        this.dv = value;
    }

    /**
     * Obtiene el valor de la propiedad rucAnterior.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRucAnterior() {
        return rucAnterior;
    }

    /**
     * Define el valor de la propiedad rucAnterior.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRucAnterior(String value) {
        this.rucAnterior = value;
    }

    /**
     * Obtiene el valor de la propiedad rucEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRucEstado() {
        return rucEstado;
    }

    /**
     * Define el valor de la propiedad rucEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRucEstado(String value) {
        this.rucEstado = value;
    }

}
