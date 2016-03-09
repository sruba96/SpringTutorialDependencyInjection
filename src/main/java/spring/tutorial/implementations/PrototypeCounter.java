package spring.tutorial.implementations;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by pawel on 09.03.16.
 */
@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class PrototypeCounter extends Counter {
}
