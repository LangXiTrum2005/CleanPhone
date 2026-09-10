package org.objectweb.asm.tree.analysis;

import java.util.Iterator;
import java.util.List;
import org.objectweb.asm.Type;

/* JADX INFO: loaded from: classes5.dex */
public class SimpleVerifier extends BasicVerifier {
    private final Type currentClass;
    private final List<Type> currentClassInterfaces;
    private final Type currentSuperClass;
    private final boolean isInterface;
    private ClassLoader loader;

    public SimpleVerifier() {
        this(null, null, false);
    }

    private BasicValue newArrayValue(Type type, int i) {
        if (i == 0) {
            return newValue(type);
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append('[');
        }
        sb.append(type.getDescriptor());
        return newValue(Type.getType(sb.toString()));
    }

    public Class<?> getClass(Type type) {
        try {
            return type.getSort() == 9 ? Class.forName(type.getDescriptor().replace('/', '.'), false, this.loader) : Class.forName(type.getClassName(), false, this.loader);
        } catch (ClassNotFoundException e) {
            throw new TypeNotPresentException(e.toString(), e);
        }
    }

    @Override // org.objectweb.asm.tree.analysis.BasicVerifier
    public BasicValue getElementValue(BasicValue basicValue) throws AnalyzerException {
        Type type = basicValue.getType();
        if (type != null) {
            if (type.getSort() == 9) {
                return newValue(Type.getType(type.getDescriptor().substring(1)));
            }
            if (type.equals(BasicInterpreter.NULL_TYPE)) {
                return basicValue;
            }
        }
        throw new AssertionError();
    }

    public Type getSuperClass(Type type) {
        Type type2 = this.currentClass;
        if (type2 != null && type2.equals(type)) {
            return this.currentSuperClass;
        }
        Class<? super Object> superclass = getClass(type).getSuperclass();
        if (superclass == null) {
            return null;
        }
        return Type.getType(superclass);
    }

    @Override // org.objectweb.asm.tree.analysis.BasicVerifier
    public boolean isArrayValue(BasicValue basicValue) {
        Type type = basicValue.getType();
        if (type != null) {
            return type.getSort() == 9 || type.equals(BasicInterpreter.NULL_TYPE);
        }
        return false;
    }

    public boolean isAssignableFrom(Type type, Type type2) {
        if (type.equals(type2)) {
            return true;
        }
        Type type3 = this.currentClass;
        if (type3 != null && type3.equals(type)) {
            if (getSuperClass(type2) == null) {
                return false;
            }
            if (this.isInterface) {
                return type2.getSort() == 10 || type2.getSort() == 9;
            }
            return isAssignableFrom(type, getSuperClass(type2));
        }
        Type type4 = this.currentClass;
        if (type4 == null || !type4.equals(type2)) {
            return getClass(type).isAssignableFrom(getClass(type2));
        }
        if (isAssignableFrom(type, this.currentSuperClass)) {
            return true;
        }
        List<Type> list = this.currentClassInterfaces;
        if (list != null) {
            Iterator<Type> it = list.iterator();
            while (it.hasNext()) {
                if (isAssignableFrom(type, it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isInterface(Type type) {
        Type type2 = this.currentClass;
        return (type2 == null || !type2.equals(type)) ? getClass(type).isInterface() : this.isInterface;
    }

    @Override // org.objectweb.asm.tree.analysis.BasicVerifier
    public boolean isSubTypeOf(BasicValue basicValue, BasicValue basicValue2) {
        Type type = basicValue2.getType();
        Type type2 = basicValue.getType();
        switch (type.getSort()) {
            case 5:
            case 6:
            case 7:
            case 8:
                return type2.equals(type);
            case 9:
            case 10:
                if (type2.equals(BasicInterpreter.NULL_TYPE)) {
                    return true;
                }
                if (type2.getSort() != 10 && type2.getSort() != 9) {
                    return false;
                }
                if (isAssignableFrom(type, type2)) {
                    return true;
                }
                if (getClass(type).isInterface()) {
                    return Object.class.isAssignableFrom(getClass(type2));
                }
                return false;
            default:
                throw new AssertionError();
        }
    }

    public void setClassLoader(ClassLoader classLoader) {
        this.loader = classLoader;
    }

    public SimpleVerifier(Type type, Type type2, boolean z) {
        this(type, type2, null, z);
    }

    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter, org.objectweb.asm.tree.analysis.Interpreter
    public BasicValue merge(BasicValue basicValue, BasicValue basicValue2) {
        int dimensions;
        if (basicValue.equals(basicValue2)) {
            return basicValue;
        }
        Type type = basicValue.getType();
        Type type2 = basicValue2.getType();
        if (type == null || !((type.getSort() == 10 || type.getSort() == 9) && type2 != null && (type2.getSort() == 10 || type2.getSort() == 9))) {
            return BasicValue.UNINITIALIZED_VALUE;
        }
        Type type3 = BasicInterpreter.NULL_TYPE;
        if (!type.equals(type3)) {
            if (type2.equals(type3) || isAssignableFrom(type, type2)) {
                return basicValue;
            }
            if (!isAssignableFrom(type2, type)) {
                if (type.getSort() == 9 && type2.getSort() == 9 && type.getDimensions() == type2.getDimensions() && type.getElementType().getSort() == 10 && type2.getElementType().getSort() == 10) {
                    dimensions = type.getDimensions();
                    type = type.getElementType();
                    type2 = type2.getElementType();
                } else {
                    dimensions = 0;
                }
                while (type != null && !isInterface(type)) {
                    type = getSuperClass(type);
                    if (isAssignableFrom(type, type2)) {
                        return newArrayValue(type, dimensions);
                    }
                }
                return newArrayValue(Type.getObjectType("java/lang/Object"), dimensions);
            }
        }
        return basicValue2;
    }

    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter, org.objectweb.asm.tree.analysis.Interpreter
    public BasicValue newValue(Type type) {
        int sort;
        if (type == null) {
            return BasicValue.UNINITIALIZED_VALUE;
        }
        boolean z = type.getSort() == 9;
        if (z && ((sort = type.getElementType().getSort()) == 1 || sort == 2 || sort == 3 || sort == 4)) {
            return new BasicValue(type);
        }
        BasicValue basicValueNewValue = super.newValue(type);
        if (!BasicValue.REFERENCE_VALUE.equals(basicValueNewValue)) {
            return basicValueNewValue;
        }
        if (!z) {
            return new BasicValue(type);
        }
        BasicValue basicValueNewValue2 = newValue(type.getElementType());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < type.getDimensions(); i++) {
            sb.append('[');
        }
        sb.append(basicValueNewValue2.getType().getDescriptor());
        return new BasicValue(Type.getType(sb.toString()));
    }

    public SimpleVerifier(Type type, Type type2, List<Type> list, boolean z) {
        this(589824, type, type2, list, z);
        if (getClass() != SimpleVerifier.class) {
            throw new IllegalStateException();
        }
    }

    public SimpleVerifier(int i, Type type, Type type2, List<Type> list, boolean z) {
        super(i);
        this.loader = getClass().getClassLoader();
        this.currentClass = type;
        this.currentSuperClass = type2;
        this.currentClassInterfaces = list;
        this.isInterface = z;
    }
}
