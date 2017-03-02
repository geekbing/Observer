package subject;

import observer.Observer;

/**
 * Author: bing
 * Date: 2017-03-02 15:59
 * Email: dhuzbb@163.com
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removerObserver(Observer observer);

    void notifyObservers();
}
