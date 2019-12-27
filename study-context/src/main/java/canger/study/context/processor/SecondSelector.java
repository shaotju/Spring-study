package canger.study.context.processor;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class SecondSelector implements ImportSelector {
    public SecondSelector() {
    }

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"canger.study.context.animinal.cat"};
    }
}
