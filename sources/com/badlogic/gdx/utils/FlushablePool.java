package com.badlogic.gdx.utils;

/* JADX INFO: loaded from: classes.dex */
public abstract class FlushablePool<T> extends Pool<T> {
    protected Array<T> obtained;

    public FlushablePool() {
        this.obtained = new Array<>();
    }

    public void flush() {
        super.freeAll(this.obtained);
        this.obtained.clear();
    }

    @Override // com.badlogic.gdx.utils.Pool
    public void free(T t) {
        this.obtained.removeValue(t, true);
        super.free(t);
    }

    @Override // com.badlogic.gdx.utils.Pool
    public void freeAll(Array<T> array) {
        this.obtained.removeAll(array, true);
        super.freeAll(array);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.badlogic.gdx.utils.Pool
    public T obtain() {
        T t = (T) super.obtain();
        this.obtained.add(t);
        return t;
    }

    public FlushablePool(int i) {
        super(i);
        this.obtained = new Array<>();
    }

    public FlushablePool(int i, int i2) {
        super(i, i2);
        this.obtained = new Array<>();
    }
}
