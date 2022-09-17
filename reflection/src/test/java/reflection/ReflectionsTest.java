package reflection;

import annotation.Controller;
import annotation.Repository;
import annotation.Service;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.reflections.Reflections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class ReflectionsTest {

    private static final Logger log = LoggerFactory.getLogger(ReflectionsTest.class);

    @Test
    void showAnnotationClass() {
        Reflections reflections = new Reflections("examples");

        // TODO 클래스 레벨에 @Controller, @Service, @Repository 애노테이션이 설정되어 모든 클래스 찾아 로그로 출력한다.
        Set<Class<?>> targets = new HashSet<>();
        targets.addAll(reflections.getTypesAnnotatedWith(Controller.class));
        targets.addAll(reflections.getTypesAnnotatedWith(Service.class));
        targets.addAll(reflections.getTypesAnnotatedWith(Repository.class));

        List<String> targetNames = targets.stream()
            .map(Class::getSimpleName)
            .collect(Collectors.toList());

        for (String name : targetNames) {
            log.info(name);
        }
    }
}
