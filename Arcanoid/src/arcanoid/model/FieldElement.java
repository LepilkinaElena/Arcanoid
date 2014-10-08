/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arcanoid.model;

import arcanoid.buffer.Buffer;
import arcanoid.service.ImpulseOfStrikeForce;
import arcanoid.service.Size;
import arcanoid.service.SpeedVector;
import com.golden.gamedev.object.Sprite;
import java.awt.Point;

/**
 * Элемент поля
 * 
 * @author Елена
 */
public abstract class FieldElement {
    /** Таблица соответствий элемента поля со спрайтом */
    private Buffer table;
    /** Подтип элемента для отличия элементов одного типа, которые могут сталкиваться между собой */
    private int subtype;
    /** Вес */
    private double weight;
    /** Скорость */
    private SpeedVector speed;
    
    /**
     *  Конструктор
     */
    public FieldElement (Buffer table) {
        subtype = -1;
        weight = 0;
        speed = new SpeedVector();
        this.table = table;
    }
    
    /**
     * Конструктор
     * @param subtype подтип
     */
    public FieldElement (int subtype, Buffer table) {
        this(table);
        this.subtype = subtype;
    }
    
    /**
     * Конструктор
     * @param weight вес
     */
    public FieldElement (double weight, Buffer table) {
        this(table);
        this.weight = weight;
    }
    
    /**
     * Конструктор
     * @param speed скорость
     */
    public FieldElement (SpeedVector speed, Buffer table) {
        this(table);
        this.speed = speed;
    }
    
    /**
     * Конструктор
     * @param weight вес
     * @param speed скорость
     */
    public FieldElement (double weight, SpeedVector speed, Buffer table) {
        this(weight, table);
        this.speed = speed;
    }
    
    /**
     * Конструктор
     * @param weight вес 
     * @param subtype подтип
     */
    public FieldElement (double weight, int subtype, Buffer table) {
        this(weight, table);
        this.subtype = subtype;
    }
    
    /**
     * Конструктор
     * @param speed скорость
     * @param subtype подтип
     */
    public FieldElement (SpeedVector speed, int subtype, Buffer table) {
        this(speed, table);
        this.subtype = subtype;
    }
    
    /**
     * Конструктор
     * @param weight вес
     * @param speed скорость
     * @param subtype подтип
     */
    public FieldElement (double weight, SpeedVector speed, int subtype, Buffer table) {
        this(weight, speed, table);
        this.subtype = subtype;
    }
    
    /** 
     * Получить позицию
     * 
     * @return позиция
     */
    public Point position() {

    }
    
    /**
     * Получить размер
     * 
     * @return размер
     */
    public Size size() {
        
    }
    
    /**
     * Полуить спрайт, соответствующий данному элементу
     * 
     * @return спрайт
     */
    private Sprite getSprite () {
        
    }
    
    /**
     * Получить скорость
     * 
     * @return вектор скорости
     */
    public SpeedVector speed() {
        return speed;
    }
    
    /**
     * Обработать столкновение
     * 
     * @param force импульс силы удара
     */
    public void handleCollision(ImpulseOfStrikeForce force) {
        
    }
    
    /**
     * Задать скорость
     * 
     * @param speed вектор скорости
     */
    public void setSpeed (SpeedVector speed) {
        this.speed = speed;
    }
}
