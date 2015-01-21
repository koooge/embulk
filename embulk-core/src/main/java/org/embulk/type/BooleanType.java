package org.embulk.type;

public class BooleanType
        extends AbstractType
{
    static final BooleanType BOOLEAN = new BooleanType();

    private BooleanType()
    {
        super("boolean", boolean.class, 1);
    }
}
