package reflection;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

class Junit3TestRunner {

    @Test
    void run() throws Exception {
        Class<Junit3Test> clazz = Junit3Test.class;

        // TODO Junit3Test에서 test로 시작하는 메소드 실행
        List<Method> methods = Arrays.stream(clazz.getMethods())
            .filter(it -> it.getName().startsWith("test"))
            .collect(Collectors.toList());
        Junit3Test junit3Test = clazz.getConstructor().newInstance();
        for (Method method : methods) {
            method.invoke(junit3Test);
        }
    }
}
