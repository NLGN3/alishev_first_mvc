package ru.alishev.springcourse.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//класс, который нам заменяет первичную точку входа - web.xml
// Spring запускает этот класс автоматически, если он наследует именно этот абстрактный класс
public class SpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
//    возвращаем наш конфигурационный класс для диспатчер сервлета
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {SpringConfig.class};
    }

    @Override
//    активируем наш Dispatcher Servlet на любой URL
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
