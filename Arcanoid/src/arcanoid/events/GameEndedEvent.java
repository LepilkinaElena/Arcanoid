/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arcanoid.events;

import java.util.EventObject;

/**
 * Событие окончания игры
 * 
 * @author Мария
 */
public class GameEndedEvent extends EventObject {

    /**
     * Конструктор
     * 
     * @param source 
     */
    public GameEndedEvent(Object source) {
        super(source);
    }
    
}
