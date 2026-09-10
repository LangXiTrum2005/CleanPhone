package kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes7.dex */
public final class Checks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Name f44608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Regex f44609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Collection f44610c;
    public final Function1 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Check[] f44611e;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.util.Checks$2, reason: invalid class name */
    final class AnonymousClass2 extends Lambda implements Function1 {
        public static final AnonymousClass2 X = new AnonymousClass2(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Intrinsics.f((FunctionDescriptor) obj, "$this$null");
            return null;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.util.Checks$3, reason: invalid class name */
    final class AnonymousClass3 extends Lambda implements Function1 {
        public static final AnonymousClass3 X = new AnonymousClass3(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Intrinsics.f((FunctionDescriptor) obj, "$this$null");
            return null;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.util.Checks$4, reason: invalid class name */
    final class AnonymousClass4 extends Lambda implements Function1 {
        public static final AnonymousClass4 X = new AnonymousClass4(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Intrinsics.f((FunctionDescriptor) obj, "$this$null");
            return null;
        }
    }

    public Checks(Name name, Regex regex, Collection collection, Function1 function1, Check... checkArr) {
        this.f44608a = name;
        this.f44609b = regex;
        this.f44610c = collection;
        this.d = function1;
        this.f44611e = checkArr;
    }

    public /* synthetic */ Checks(Name name, Check[] checkArr) {
        this(name, checkArr, AnonymousClass2.X);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(Name name, Check[] checkArr, Function1 function1) {
        this(name, null, null, function1, (Check[]) Arrays.copyOf(checkArr, checkArr.length));
        Intrinsics.f(name, "name");
    }

    public /* synthetic */ Checks(Set set, Check[] checkArr) {
        this(set, checkArr, AnonymousClass4.X);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(Collection nameList, Check[] checkArr, Function1 function1) {
        this(null, null, nameList, function1, (Check[]) Arrays.copyOf(checkArr, checkArr.length));
        Intrinsics.f(nameList, "nameList");
    }
}
