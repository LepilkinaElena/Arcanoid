/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arcanoid.events;

import java.util.EventListener;

/**
 * Слушатель падения мяча
 * 
 * @author Мария
 */
public interface BallFailedListener extends EventListener {
    /**
     * Обработать падение мяча за нижнию границу
     * 
     * @param e 
     */
    void fail(BallFailedEvent e);
}
