package kotlin.reflect.jvm.internal.calls;

import com.google.android.gms.ads.RequestConfiguration;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\b\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\u0007\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Member;", "M", "Lkotlin/reflect/jvm/internal/calls/Caller;", "AccessorForHiddenBoundConstructor", "AccessorForHiddenConstructor", "BoundConstructor", "Companion", "Constructor", "FieldGetter", "FieldSetter", "Method", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenBoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$BoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Constructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class CallerImpl<M extends Member> implements Caller<M> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Member f43435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f43436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f43437c;
    public final List d;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenBoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AccessorForHiddenBoundConstructor extends CallerImpl<java.lang.reflect.Constructor<?>> implements BoundCaller {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Object f43438e;

        /* JADX WARN: Illegal instructions before constructor call */
        public AccessorForHiddenBoundConstructor(java.lang.reflect.Constructor constructor, Object obj) {
            Intrinsics.f(constructor, "constructor");
            Class declaringClass = constructor.getDeclaringClass();
            Intrinsics.e(declaringClass, "constructor.declaringClass");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            Intrinsics.e(genericParameterTypes, "constructor.genericParameterTypes");
            super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 2 ? new Type[0] : ArraysKt.r(genericParameterTypes, 1, genericParameterTypes.length - 1)));
            this.f43438e = obj;
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public final Object call(Object[] args) {
            Intrinsics.f(args, "args");
            Caller.DefaultImpls.a(this, args);
            java.lang.reflect.Constructor constructor = (java.lang.reflect.Constructor) this.f43435a;
            SpreadBuilder spreadBuilder = new SpreadBuilder(3);
            spreadBuilder.a(this.f43438e);
            spreadBuilder.b(args);
            spreadBuilder.a(null);
            ArrayList arrayList = spreadBuilder.f43336a;
            return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AccessorForHiddenConstructor extends CallerImpl<java.lang.reflect.Constructor<?>> {
        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public final Object call(Object[] args) {
            Intrinsics.f(args, "args");
            Caller.DefaultImpls.a(this, args);
            java.lang.reflect.Constructor constructor = (java.lang.reflect.Constructor) this.f43435a;
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.b(args);
            spreadBuilder.a(null);
            ArrayList arrayList = spreadBuilder.f43336a;
            return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$BoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class BoundConstructor extends CallerImpl<java.lang.reflect.Constructor<?>> implements BoundCaller {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Object f43439e;

        /* JADX WARN: Illegal instructions before constructor call */
        public BoundConstructor(java.lang.reflect.Constructor constructor, Object obj) {
            Intrinsics.f(constructor, "constructor");
            Class declaringClass = constructor.getDeclaringClass();
            Intrinsics.e(declaringClass, "constructor.declaringClass");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            Intrinsics.e(genericParameterTypes, "constructor.genericParameterTypes");
            super(constructor, declaringClass, null, genericParameterTypes);
            this.f43439e = obj;
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public final Object call(Object[] args) {
            Intrinsics.f(args, "args");
            Caller.DefaultImpls.a(this, args);
            java.lang.reflect.Constructor constructor = (java.lang.reflect.Constructor) this.f43435a;
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.a(this.f43439e);
            spreadBuilder.b(args);
            ArrayList arrayList = spreadBuilder.f43336a;
            return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001J*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0001\u0010\u0002\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0003H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0001\u0010\u0002\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0003H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0005J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0001\u0010\u0002\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0003H\u0086\b¢\u0006\u0004\b\u0007\u0010\u0005¨\u0006\b"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Companion;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "dropFirst", "([Ljava/lang/Object;)[Ljava/lang/Object;", "dropFirstAndLast", "dropLast", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Constructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Constructor extends CallerImpl<java.lang.reflect.Constructor<?>> {
        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public final Object call(Object[] args) {
            Intrinsics.f(args, "args");
            Caller.DefaultImpls.a(this, args);
            return ((java.lang.reflect.Constructor) this.f43435a).newInstance(Arrays.copyOf(args, args.length));
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Field;", "BoundInstance", "BoundJvmStaticInObject", "Instance", "JvmStaticInObject", "Static", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Static;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class FieldGetter extends CallerImpl<Field> {

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class BoundInstance extends FieldGetter implements BoundCaller {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final Object f43440e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BoundInstance(Field field, Object obj) {
                super(field, false);
                Intrinsics.f(field, "field");
                this.f43440e = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.CallerImpl.FieldGetter, kotlin.reflect.jvm.internal.calls.Caller
            public final Object call(Object[] args) {
                Intrinsics.f(args, "args");
                Caller.DefaultImpls.a(this, args);
                return ((Field) this.f43435a).get(this.f43440e);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class BoundJvmStaticInObject extends FieldGetter implements BoundCaller {
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Instance extends FieldGetter {
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class JvmStaticInObject extends FieldGetter {
            @Override // kotlin.reflect.jvm.internal.calls.CallerImpl
            public final void c(Object[] args) {
                Intrinsics.f(args, "args");
                Caller.DefaultImpls.a(this, args);
                d(ArraysKt.y(args));
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Static extends FieldGetter {
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public FieldGetter(Field field, boolean z2) {
            Type genericType = field.getGenericType();
            Intrinsics.e(genericType, "field.genericType");
            super(field, genericType, z2 ? field.getDeclaringClass() : null, new Type[0]);
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public Object call(Object[] args) {
            Intrinsics.f(args, "args");
            c(args);
            return ((Field) this.f43435a).get(this.f43437c != null ? ArraysKt.x(args) : null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Field;", "BoundInstance", "BoundJvmStaticInObject", "Instance", "JvmStaticInObject", "Static", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Static;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class FieldSetter extends CallerImpl<Field> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f43441e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class BoundInstance extends FieldSetter implements BoundCaller {
            public final Object f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BoundInstance(Field field, boolean z2, Object obj) {
                super(field, z2, false);
                Intrinsics.f(field, "field");
                this.f = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter, kotlin.reflect.jvm.internal.calls.Caller
            public final Object call(Object[] args) throws IllegalAccessException {
                Intrinsics.f(args, "args");
                c(args);
                ((Field) this.f43435a).set(this.f, ArraysKt.x(args));
                return Unit.f43263a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class BoundJvmStaticInObject extends FieldSetter implements BoundCaller {
            @Override // kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter, kotlin.reflect.jvm.internal.calls.Caller
            public final Object call(Object[] args) throws IllegalAccessException {
                Intrinsics.f(args, "args");
                c(args);
                ((Field) this.f43435a).set(null, ArraysKt.J(args));
                return Unit.f43263a;
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Instance extends FieldSetter {
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class JvmStaticInObject extends FieldSetter {
            @Override // kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter, kotlin.reflect.jvm.internal.calls.CallerImpl
            public final void c(Object[] args) {
                Intrinsics.f(args, "args");
                super.c(args);
                d(ArraysKt.y(args));
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Static extends FieldSetter {
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public FieldSetter(Field field, boolean z2, boolean z3) {
            Class TYPE = Void.TYPE;
            Intrinsics.e(TYPE, "TYPE");
            Class<?> declaringClass = z3 ? field.getDeclaringClass() : null;
            Type genericType = field.getGenericType();
            Intrinsics.e(genericType, "field.genericType");
            super(field, TYPE, declaringClass, new Type[]{genericType});
            this.f43441e = z2;
        }

        @Override // kotlin.reflect.jvm.internal.calls.CallerImpl
        public void c(Object[] args) {
            Intrinsics.f(args, "args");
            Caller.DefaultImpls.a(this, args);
            if (this.f43441e && ArraysKt.J(args) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public Object call(Object[] args) throws IllegalAccessException {
            Intrinsics.f(args, "args");
            c(args);
            ((Field) this.f43435a).set(this.f43437c != null ? ArraysKt.x(args) : null, ArraysKt.J(args));
            return Unit.f43263a;
        }
    }

    public CallerImpl(Member member, Type type, Class cls, Type[] typeArr) {
        List listM;
        this.f43435a = member;
        this.f43436b = type;
        this.f43437c = cls;
        if (cls != null) {
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.a(cls);
            spreadBuilder.b(typeArr);
            ArrayList arrayList = spreadBuilder.f43336a;
            listM = CollectionsKt.I(arrayList.toArray(new Type[arrayList.size()]));
        } else {
            listM = ArraysKt.M(typeArr);
        }
        this.d = listM;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getD() {
        return this.d;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Member getF43435a() {
        return this.f43435a;
    }

    public void c(Object[] objArr) {
        Caller.DefaultImpls.a(this, objArr);
    }

    public final void d(Object obj) {
        if (obj == null || !this.f43435a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* JADX INFO: renamed from: getReturnType, reason: from getter */
    public final Type getF43436b() {
        return this.f43436b;
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Method;", "BoundInstance", "BoundJvmStaticInObject", "BoundStatic", "Instance", "JvmStaticInObject", "Static", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStatic;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Static;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Method extends CallerImpl<java.lang.reflect.Method> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f43442e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class BoundInstance extends Method implements BoundCaller {
            public final Object f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BoundInstance(Object obj, java.lang.reflect.Method method) {
                super(method, false, 4);
                Intrinsics.f(method, "method");
                this.f = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.Caller
            public final Object call(Object[] args) {
                Intrinsics.f(args, "args");
                Caller.DefaultImpls.a(this, args);
                return e(this.f, args);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class BoundJvmStaticInObject extends Method implements BoundCaller {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BoundJvmStaticInObject(java.lang.reflect.Method method) {
                super(method, false, 4);
                Intrinsics.f(method, "method");
            }

            @Override // kotlin.reflect.jvm.internal.calls.Caller
            public final Object call(Object[] args) {
                Intrinsics.f(args, "args");
                Caller.DefaultImpls.a(this, args);
                return e(null, args);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStatic;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class BoundStatic extends Method implements BoundCaller {
            public final Object f;

            /* JADX WARN: Illegal instructions before constructor call */
            public BoundStatic(Object obj, java.lang.reflect.Method method) {
                Intrinsics.f(method, "method");
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                Intrinsics.e(genericParameterTypes, "method.genericParameterTypes");
                super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : ArraysKt.r(genericParameterTypes, 1, genericParameterTypes.length)));
                this.f = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.Caller
            public final Object call(Object[] args) {
                Intrinsics.f(args, "args");
                Caller.DefaultImpls.a(this, args);
                SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                spreadBuilder.a(this.f);
                spreadBuilder.b(args);
                ArrayList arrayList = spreadBuilder.f43336a;
                return e(null, arrayList.toArray(new Object[arrayList.size()]));
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Instance extends Method {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Instance(java.lang.reflect.Method method) {
                super(method, false, 6);
                Intrinsics.f(method, "method");
            }

            @Override // kotlin.reflect.jvm.internal.calls.Caller
            public final Object call(Object[] args) {
                Intrinsics.f(args, "args");
                Caller.DefaultImpls.a(this, args);
                return e(args[0], args.length <= 1 ? new Object[0] : ArraysKt.r(args, 1, args.length));
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class JvmStaticInObject extends Method {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public JvmStaticInObject(java.lang.reflect.Method method) {
                super(method, true, 4);
                Intrinsics.f(method, "method");
            }

            @Override // kotlin.reflect.jvm.internal.calls.Caller
            public final Object call(Object[] args) {
                Intrinsics.f(args, "args");
                Caller.DefaultImpls.a(this, args);
                d(ArraysKt.y(args));
                return e(null, args.length <= 1 ? new Object[0] : ArraysKt.r(args, 1, args.length));
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Static extends Method {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Static(java.lang.reflect.Method method) {
                super(method, false, 6);
                Intrinsics.f(method, "method");
            }

            @Override // kotlin.reflect.jvm.internal.calls.Caller
            public final Object call(Object[] args) {
                Intrinsics.f(args, "args");
                Caller.DefaultImpls.a(this, args);
                return e(null, args);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Method(java.lang.reflect.Method method, boolean z2, int i2) {
            z2 = (i2 & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z2;
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Intrinsics.e(genericParameterTypes, "method.genericParameterTypes");
            this(method, z2, genericParameterTypes);
        }

        public final Object e(Object obj, Object[] args) {
            Intrinsics.f(args, "args");
            return this.f43442e ? Unit.f43263a : ((java.lang.reflect.Method) this.f43435a).invoke(obj, Arrays.copyOf(args, args.length));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Method(java.lang.reflect.Method method, boolean z2, Type[] typeArr) {
            Type genericReturnType = method.getGenericReturnType();
            Intrinsics.e(genericReturnType, "method.genericReturnType");
            super(method, genericReturnType, z2 ? method.getDeclaringClass() : null, typeArr);
            this.f43442e = genericReturnType.equals(Void.TYPE);
        }
    }
}
