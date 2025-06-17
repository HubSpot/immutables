package src.org.immutables.fixture.nullable.typeuse;

import org.immutables.value.Value;
import org.jspecify.annotations.Nullable;

public interface TypeUseInheritance {
    String getString();

    @Nullable
    ImmutableMyField getMyField();

    @Value.Immutable
    interface MyField {}

    @Value.Immutable
    abstract class FirstChild implements TypeUseInheritance {}

    @Value.Immutable
    interface SecondChild extends TypeUseInheritance {}
}
