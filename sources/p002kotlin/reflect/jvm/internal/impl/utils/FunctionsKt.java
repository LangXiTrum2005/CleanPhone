package p002kotlin.reflect.jvm.internal.impl.utils;

import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import tetrahedral.triweekly;

/* JADX INFO: compiled from: functions.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class FunctionsKt {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Function1<Object, Object> f31920attabal = new Function1<Object, Object>() { // from class: kotlin.reflect.jvm.internal.impl.utils.FunctionsKt$IDENTITY$1
        @Override // p002kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return obj;
        }
    };

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Function1<Object, Boolean> f31924saneness = new Function1<Object, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.utils.FunctionsKt$ALWAYS_TRUE$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p002kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.TRUE;
        }
    };

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Function1<Object, Object> f31922dern = new Function1() { // from class: kotlin.reflect.jvm.internal.impl.utils.FunctionsKt$ALWAYS_NULL$1
        @Override // p002kotlin.jvm.functions.Function1
        public final Void invoke(Object obj) {
            return null;
        }
    };

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final Function1<Object, Unit> f31925wireman = new Function1<Object, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.utils.FunctionsKt$DO_NOTHING$1
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Object obj) {
        }

        @Override // p002kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.f29295attabal;
        }
    };

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final Function2<Object, Object, Unit> f31923marial = new Function2<Object, Object, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.utils.FunctionsKt$DO_NOTHING_2$1
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Object obj, Object obj2) {
        }

        @Override // p002kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2) {
            invoke2(obj, obj2);
            return Unit.f29295attabal;
        }
    };

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final triweekly<Object, Object, Object, Unit> f31921beachfront = new triweekly<Object, Object, Object, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.utils.FunctionsKt$DO_NOTHING_3$1
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Object obj, Object obj2, Object obj3) {
        }

        @Override // tetrahedral.triweekly
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2, Object obj3) {
            invoke2(obj, obj2, obj3);
            return Unit.f29295attabal;
        }
    };

    public static final <T> Function1<T, Boolean> attabal() {
        return (Function1<T, Boolean>) f31924saneness;
    }

    public static final triweekly<Object, Object, Object, Unit> saneness() {
        return f31921beachfront;
    }
}
