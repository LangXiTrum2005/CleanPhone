package p002kotlin.reflect.jvm.internal.calls;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.C3700q2;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.arytenoidectomy;
import p002kotlin.collections.polloi;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.dovishness;

/* JADX INFO: compiled from: CallerImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u001b*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\b\u0012\u0014\u0019\u0010\u001b!\"#B5\b\u0004\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0004¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u0012\u0010\u001f\u0082\u0001\u0007$%&'()*¨\u0006+"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/wireman;", "Ljava/lang/reflect/Member;", "M", "Lkotlin/reflect/jvm/internal/calls/dern;", "member", "Ljava/lang/reflect/Type;", "returnType", "Ljava/lang/Class;", "instanceClass", "", "valueParameterTypes", "<init>", "(Ljava/lang/reflect/Member;Ljava/lang/reflect/Type;Ljava/lang/Class;[Ljava/lang/reflect/Type;)V", "", "obj", "", "wireman", "(Ljava/lang/Object;)V", "attabal", "Ljava/lang/reflect/Member;", "saneness", "()Ljava/lang/reflect/Member;", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "dern", "Ljava/lang/Class;", "marial", "()Ljava/lang/Class;", "", "Ljava/util/List;", "()Ljava/util/List;", "parameterTypes", "beachfront", "competently", "impromptu", "Lkotlin/reflect/jvm/internal/calls/wireman$attabal;", "Lkotlin/reflect/jvm/internal/calls/wireman$saneness;", "Lkotlin/reflect/jvm/internal/calls/wireman$dern;", "Lkotlin/reflect/jvm/internal/calls/wireman$marial;", "Lkotlin/reflect/jvm/internal/calls/wireman$beachfront;", "Lkotlin/reflect/jvm/internal/calls/wireman$competently;", "Lkotlin/reflect/jvm/internal/calls/wireman$impromptu;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class wireman<M extends Member> implements p002kotlin.reflect.jvm.internal.calls.dern<M> {

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final M member;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final Class<?> instanceClass;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final Type returnType;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final List<Type> parameterTypes;

    /* JADX INFO: compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003B\u001d\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/wireman$attabal;", "Lkotlin/reflect/jvm/internal/calls/wireman;", "Ljava/lang/reflect/Constructor;", "Lkotlin/reflect/jvm/internal/calls/saneness;", "constructor", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V", "", "args", NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "beachfront", "Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class attabal extends wireman<Constructor<?>> implements p002kotlin.reflect.jvm.internal.calls.saneness {

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
        public final Object boundReceiver;

        /* JADX WARN: Illegal instructions before constructor call */
        public attabal(Constructor<?> constructor, Object obj) {
            Intrinsics.checkNotNullParameter(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 2 ? new Type[0] : arytenoidectomy.arytenoidectomy(genericParameterTypes, 1, genericParameterTypes.length - 1)), null);
            this.boundReceiver = obj;
        }

        @Override // p002kotlin.reflect.jvm.internal.calls.dern
        public Object call(Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            dern(args);
            Constructor<?> constructorSaneness = saneness();
            dovishness dovishnessVar = new dovishness(3);
            dovishnessVar.attabal(this.boundReceiver);
            dovishnessVar.saneness(args);
            dovishnessVar.attabal(null);
            return constructorSaneness.newInstance(dovishnessVar.wireman(new Object[dovishnessVar.dern()]));
        }
    }

    /* JADX INFO: compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\r\u000e\u000f\u0010\u0011B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0004\b\u000b\u0010\f\u0082\u0001\u0005\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/wireman$beachfront;", "Lkotlin/reflect/jvm/internal/calls/wireman;", "Ljava/lang/reflect/Field;", "field", "", "requiresInstance", "<init>", "(Ljava/lang/reflect/Field;Z)V", "", "args", "", NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "attabal", "saneness", "dern", "wireman", "marial", "Lkotlin/reflect/jvm/internal/calls/wireman$beachfront$attabal;", "Lkotlin/reflect/jvm/internal/calls/wireman$beachfront$saneness;", "Lkotlin/reflect/jvm/internal/calls/wireman$beachfront$dern;", "Lkotlin/reflect/jvm/internal/calls/wireman$beachfront$wireman;", "Lkotlin/reflect/jvm/internal/calls/wireman$beachfront$marial;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class beachfront extends wireman<Field> {

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/wireman$beachfront$attabal;", "Lkotlin/reflect/jvm/internal/calls/saneness;", "Lkotlin/reflect/jvm/internal/calls/wireman$beachfront;", "Ljava/lang/reflect/Field;", "field", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Field;Ljava/lang/Object;)V", "", "args", NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "beachfront", "Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class attabal extends beachfront implements p002kotlin.reflect.jvm.internal.calls.saneness {

            /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
            public final Object boundReceiver;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public attabal(Field field, Object obj) {
                super(field, false, null);
                Intrinsics.checkNotNullParameter(field, "field");
                this.boundReceiver = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.wireman.beachfront, p002kotlin.reflect.jvm.internal.calls.dern
            public Object call(Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                dern(args);
                return saneness().get(this.boundReceiver);
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/wireman$beachfront$dern;", "Lkotlin/reflect/jvm/internal/calls/wireman$beachfront;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class dern extends beachfront {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public dern(Field field) {
                super(field, true, null);
                Intrinsics.checkNotNullParameter(field, "field");
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/wireman$beachfront$marial;", "Lkotlin/reflect/jvm/internal/calls/wireman$beachfront;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class marial extends beachfront {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public marial(Field field) {
                super(field, false, null);
                Intrinsics.checkNotNullParameter(field, "field");
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/wireman$beachfront$saneness;", "Lkotlin/reflect/jvm/internal/calls/saneness;", "Lkotlin/reflect/jvm/internal/calls/wireman$beachfront;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class saneness extends beachfront implements p002kotlin.reflect.jvm.internal.calls.saneness {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public saneness(Field field) {
                super(field, false, null);
                Intrinsics.checkNotNullParameter(field, "field");
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.calls.wireman$beachfront$wireman, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/wireman$beachfront$wireman;", "Lkotlin/reflect/jvm/internal/calls/wireman$beachfront;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "", "args", "", "dern", "([Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class C0665wireman extends beachfront {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0665wireman(Field field) {
                super(field, true, null);
                Intrinsics.checkNotNullParameter(field, "field");
            }

            @Override // p002kotlin.reflect.jvm.internal.calls.wireman
            public void dern(Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                super.dern(args);
                wireman(polloi.starveling(args));
            }
        }

        public /* synthetic */ beachfront(Field field, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(field, z);
        }

        @Override // p002kotlin.reflect.jvm.internal.calls.dern
        public Object call(Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            dern(args);
            return saneness().get(marial() != null ? polloi.creditor(args) : null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public beachfront(Field field, boolean z) {
            Type genericType = field.getGenericType();
            Intrinsics.checkNotNullExpressionValue(genericType, "getGenericType(...)");
            super(field, genericType, z ? field.getDeclaringClass() : null, new Type[0], null);
        }
    }

    /* JADX INFO: compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0013\u0014\f\u0015\u0016B!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0001\u0005\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/wireman$competently;", "Lkotlin/reflect/jvm/internal/calls/wireman;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "requiresInstance", "<init>", "(Ljava/lang/reflect/Field;ZZ)V", "", "args", "", "dern", "([Ljava/lang/Object;)V", "", NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "beachfront", "Z", "attabal", "saneness", "wireman", "marial", "Lkotlin/reflect/jvm/internal/calls/wireman$competently$attabal;", "Lkotlin/reflect/jvm/internal/calls/wireman$competently$saneness;", "Lkotlin/reflect/jvm/internal/calls/wireman$competently$dern;", "Lkotlin/reflect/jvm/internal/calls/wireman$competently$wireman;", "Lkotlin/reflect/jvm/internal/calls/wireman$competently$marial;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class competently extends wireman<Field> {

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
        public final boolean notNull;

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u00072\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/wireman$competently$attabal;", "Lkotlin/reflect/jvm/internal/calls/saneness;", "Lkotlin/reflect/jvm/internal/calls/wireman$competently;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Field;ZLjava/lang/Object;)V", "", "args", NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "competently", "Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class attabal extends competently implements p002kotlin.reflect.jvm.internal.calls.saneness {

            /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
            public final Object boundReceiver;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public attabal(Field field, boolean z, Object obj) {
                super(field, z, false, null);
                Intrinsics.checkNotNullParameter(field, "field");
                this.boundReceiver = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.wireman.competently, p002kotlin.reflect.jvm.internal.calls.dern
            public Object call(Object[] args) throws IllegalAccessException {
                Intrinsics.checkNotNullParameter(args, "args");
                dern(args);
                saneness().set(this.boundReceiver, polloi.creditor(args));
                return Unit.f29295attabal;
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/wireman$competently$dern;", "Lkotlin/reflect/jvm/internal/calls/wireman$competently;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class dern extends competently {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public dern(Field field, boolean z) {
                super(field, z, true, null);
                Intrinsics.checkNotNullParameter(field, "field");
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/wireman$competently$marial;", "Lkotlin/reflect/jvm/internal/calls/wireman$competently;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class marial extends competently {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public marial(Field field, boolean z) {
                super(field, z, false, null);
                Intrinsics.checkNotNullParameter(field, "field");
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/wireman$competently$saneness;", "Lkotlin/reflect/jvm/internal/calls/saneness;", "Lkotlin/reflect/jvm/internal/calls/wireman$competently;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "", "args", "", NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class saneness extends competently implements p002kotlin.reflect.jvm.internal.calls.saneness {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public saneness(Field field, boolean z) {
                super(field, z, false, null);
                Intrinsics.checkNotNullParameter(field, "field");
            }

            @Override // kotlin.reflect.jvm.internal.calls.wireman.competently, p002kotlin.reflect.jvm.internal.calls.dern
            public Object call(Object[] args) throws IllegalAccessException {
                Intrinsics.checkNotNullParameter(args, "args");
                dern(args);
                saneness().set(null, polloi.nosophobia(args));
                return Unit.f29295attabal;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.calls.wireman$competently$wireman, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/wireman$competently$wireman;", "Lkotlin/reflect/jvm/internal/calls/wireman$competently;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "", "args", "", "dern", "([Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class C0666wireman extends competently {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0666wireman(Field field, boolean z) {
                super(field, z, true, null);
                Intrinsics.checkNotNullParameter(field, "field");
            }

            @Override // kotlin.reflect.jvm.internal.calls.wireman.competently, p002kotlin.reflect.jvm.internal.calls.wireman
            public void dern(Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                super.dern(args);
                wireman(polloi.starveling(args));
            }
        }

        public /* synthetic */ competently(Field field, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
            this(field, z, z2);
        }

        @Override // p002kotlin.reflect.jvm.internal.calls.dern
        public Object call(Object[] args) throws IllegalAccessException {
            Intrinsics.checkNotNullParameter(args, "args");
            dern(args);
            saneness().set(marial() != null ? polloi.creditor(args) : null, polloi.nosophobia(args));
            return Unit.f29295attabal;
        }

        @Override // p002kotlin.reflect.jvm.internal.calls.wireman
        public void dern(Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            super.dern(args);
            if (this.notNull && polloi.nosophobia(args) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public competently(Field field, boolean z, boolean z2) {
            Class TYPE = Void.TYPE;
            Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
            Class<?> declaringClass = z2 ? field.getDeclaringClass() : null;
            Type genericType = field.getGenericType();
            Intrinsics.checkNotNullExpressionValue(genericType, "getGenericType(...)");
            super(field, TYPE, declaringClass, new Type[]{genericType}, null);
            this.notNull = z;
        }
    }

    /* JADX INFO: compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u00012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002B\u001d\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/wireman$dern;", "Lkotlin/reflect/jvm/internal/calls/saneness;", "Lkotlin/reflect/jvm/internal/calls/wireman;", "Ljava/lang/reflect/Constructor;", "constructor", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V", "", "args", NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "beachfront", "Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class dern extends wireman<Constructor<?>> implements p002kotlin.reflect.jvm.internal.calls.saneness {

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
        public final Object boundReceiver;

        /* JADX WARN: Illegal instructions before constructor call */
        public dern(Constructor<?> constructor, Object obj) {
            Intrinsics.checkNotNullParameter(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, null, genericParameterTypes, null);
            this.boundReceiver = obj;
        }

        @Override // p002kotlin.reflect.jvm.internal.calls.dern
        public Object call(Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            dern(args);
            Constructor<?> constructorSaneness = saneness();
            dovishness dovishnessVar = new dovishness(2);
            dovishnessVar.attabal(this.boundReceiver);
            dovishnessVar.saneness(args);
            return constructorSaneness.newInstance(dovishnessVar.wireman(new Object[dovishnessVar.dern()]));
        }
    }

    /* JADX INFO: compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007\u0012\u0013\u0014\u0015\u0016\u000e\u0017B+\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010\u0082\u0001\u0007\u0018\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/wireman$impromptu;", "Lkotlin/reflect/jvm/internal/calls/wireman;", "Ljava/lang/reflect/Method;", "method", "", "requiresInstance", "", "Ljava/lang/reflect/Type;", "parameterTypes", "<init>", "(Ljava/lang/reflect/Method;Z[Ljava/lang/reflect/Type;)V", "", C3700q2.p, "args", "beachfront", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "Z", "isVoidMethod", "attabal", "saneness", "dern", "wireman", "marial", "competently", "Lkotlin/reflect/jvm/internal/calls/wireman$impromptu$attabal;", "Lkotlin/reflect/jvm/internal/calls/wireman$impromptu$saneness;", "Lkotlin/reflect/jvm/internal/calls/wireman$impromptu$dern;", "Lkotlin/reflect/jvm/internal/calls/wireman$impromptu$wireman;", "Lkotlin/reflect/jvm/internal/calls/wireman$impromptu$marial;", "Lkotlin/reflect/jvm/internal/calls/wireman$impromptu$beachfront;", "Lkotlin/reflect/jvm/internal/calls/wireman$impromptu$competently;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class impromptu extends wireman<Method> {

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
        public final boolean isVoidMethod;

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/wireman$impromptu$attabal;", "Lkotlin/reflect/jvm/internal/calls/saneness;", "Lkotlin/reflect/jvm/internal/calls/wireman$impromptu;", "Ljava/lang/reflect/Method;", "method", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "", "args", NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "competently", "Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class attabal extends impromptu implements p002kotlin.reflect.jvm.internal.calls.saneness {

            /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
            public final Object boundReceiver;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public attabal(Method method, Object obj) {
                super(method, false, null, 4, null);
                Intrinsics.checkNotNullParameter(method, "method");
                this.boundReceiver = obj;
            }

            @Override // p002kotlin.reflect.jvm.internal.calls.dern
            public Object call(Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                dern(args);
                return beachfront(this.boundReceiver, args);
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/wireman$impromptu$beachfront;", "Lkotlin/reflect/jvm/internal/calls/wireman$impromptu;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "", "args", "", NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class beachfront extends impromptu {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public beachfront(Method method) {
                super(method, true, null, 4, null);
                Intrinsics.checkNotNullParameter(method, "method");
            }

            @Override // p002kotlin.reflect.jvm.internal.calls.dern
            public Object call(Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                dern(args);
                wireman(polloi.starveling(args));
                return beachfront(null, args.length <= 1 ? new Object[0] : arytenoidectomy.arytenoidectomy(args, 1, args.length));
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/wireman$impromptu$competently;", "Lkotlin/reflect/jvm/internal/calls/wireman$impromptu;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "", "args", "", NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class competently extends impromptu {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public competently(Method method) {
                super(method, false, null, 6, null);
                Intrinsics.checkNotNullParameter(method, "method");
            }

            @Override // p002kotlin.reflect.jvm.internal.calls.dern
            public Object call(Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                dern(args);
                return beachfront(null, args);
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/wireman$impromptu$dern;", "Lkotlin/reflect/jvm/internal/calls/saneness;", "Lkotlin/reflect/jvm/internal/calls/wireman$impromptu;", "Ljava/lang/reflect/Method;", "method", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "", "args", NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "competently", "Ljava/lang/Object;", "()Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class dern extends impromptu implements p002kotlin.reflect.jvm.internal.calls.saneness {

            /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
            public final Object boundReceiver;

            /* JADX WARN: Illegal instructions before constructor call */
            public dern(Method method, Object obj) {
                Intrinsics.checkNotNullParameter(method, "method");
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
                super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : arytenoidectomy.arytenoidectomy(genericParameterTypes, 1, genericParameterTypes.length)), null);
                this.boundReceiver = obj;
            }

            @Override // p002kotlin.reflect.jvm.internal.calls.dern
            public Object call(Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                dern(args);
                dovishness dovishnessVar = new dovishness(2);
                dovishnessVar.attabal(this.boundReceiver);
                dovishnessVar.saneness(args);
                return beachfront(null, dovishnessVar.wireman(new Object[dovishnessVar.dern()]));
            }

            /* JADX INFO: renamed from: competently, reason: from getter */
            public final Object getBoundReceiver() {
                return this.boundReceiver;
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/wireman$impromptu$marial;", "Lkotlin/reflect/jvm/internal/calls/wireman$impromptu;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "", "args", "", NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class marial extends impromptu {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public marial(Method method) {
                super(method, false, null, 6, null);
                Intrinsics.checkNotNullParameter(method, "method");
            }

            @Override // p002kotlin.reflect.jvm.internal.calls.dern
            public Object call(Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                dern(args);
                return beachfront(args[0], args.length <= 1 ? new Object[0] : arytenoidectomy.arytenoidectomy(args, 1, args.length));
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/wireman$impromptu$saneness;", "Lkotlin/reflect/jvm/internal/calls/saneness;", "Lkotlin/reflect/jvm/internal/calls/wireman$impromptu;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "", "args", "", NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class saneness extends impromptu implements p002kotlin.reflect.jvm.internal.calls.saneness {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public saneness(Method method) {
                super(method, false, null, 4, null);
                Intrinsics.checkNotNullParameter(method, "method");
            }

            @Override // p002kotlin.reflect.jvm.internal.calls.dern
            public Object call(Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                dern(args);
                return beachfront(null, args);
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.calls.wireman$impromptu$wireman, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/wireman$impromptu$wireman;", "Lkotlin/reflect/jvm/internal/calls/saneness;", "Lkotlin/reflect/jvm/internal/calls/wireman$impromptu;", "Ljava/lang/reflect/Method;", "method", "", "", "boundReceiverComponents", "<init>", "(Ljava/lang/reflect/Method;[Ljava/lang/Object;)V", "args", NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "competently", "[Ljava/lang/Object;", "()[Ljava/lang/Object;", "", "impromptu", "()I", "receiverComponentsCount", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class C0667wireman extends impromptu implements p002kotlin.reflect.jvm.internal.calls.saneness {

            /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
            public final Object[] boundReceiverComponents;

            /* JADX WARN: Illegal instructions before constructor call */
            public C0667wireman(Method method, Object[] boundReceiverComponents) {
                Intrinsics.checkNotNullParameter(method, "method");
                Intrinsics.checkNotNullParameter(boundReceiverComponents, "boundReceiverComponents");
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
                super(method, false, (Type[]) polloi.grimness(genericParameterTypes, boundReceiverComponents.length).toArray(new Type[0]), null);
                this.boundReceiverComponents = boundReceiverComponents;
            }

            @Override // p002kotlin.reflect.jvm.internal.calls.dern
            public Object call(Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                dern(args);
                dovishness dovishnessVar = new dovishness(2);
                dovishnessVar.saneness(this.boundReceiverComponents);
                dovishnessVar.saneness(args);
                return beachfront(null, dovishnessVar.wireman(new Object[dovishnessVar.dern()]));
            }

            /* JADX INFO: renamed from: competently, reason: from getter */
            public final Object[] getBoundReceiverComponents() {
                return this.boundReceiverComponents;
            }

            public final int impromptu() {
                return this.boundReceiverComponents.length;
            }
        }

        public /* synthetic */ impromptu(Method method, boolean z, Type[] typeArr, DefaultConstructorMarker defaultConstructorMarker) {
            this(method, z, typeArr);
        }

        public final Object beachfront(Object instance, Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            return this.isVoidMethod ? Unit.f29295attabal : saneness().invoke(instance, Arrays.copyOf(args, args.length));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ impromptu(Method method, boolean z, Type[] typeArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
            z = (i & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z;
            if ((i & 4) != 0) {
                typeArr = method.getGenericParameterTypes();
                Intrinsics.checkNotNullExpressionValue(typeArr, "getGenericParameterTypes(...)");
            }
            this(method, z, typeArr, null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public impromptu(Method method, boolean z, Type[] typeArr) {
            Type genericReturnType = method.getGenericReturnType();
            Intrinsics.checkNotNullExpressionValue(genericReturnType, "getGenericReturnType(...)");
            super(method, genericReturnType, z ? method.getDeclaringClass() : null, typeArr, null);
            this.isVoidMethod = Intrinsics.wireman(getReturnType(), Void.TYPE);
        }
    }

    /* JADX INFO: compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/wireman$marial;", "Lkotlin/reflect/jvm/internal/calls/wireman;", "Ljava/lang/reflect/Constructor;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "", "args", "", NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class marial extends wireman<Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        public marial(Constructor<?> constructor) {
            Intrinsics.checkNotNullParameter(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
            Class<?> declaringClass2 = constructor.getDeclaringClass();
            Class<?> declaringClass3 = declaringClass2.getDeclaringClass();
            Class<?> cls = (declaringClass3 == null || Modifier.isStatic(declaringClass2.getModifiers())) ? null : declaringClass3;
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, cls, genericParameterTypes, null);
        }

        @Override // p002kotlin.reflect.jvm.internal.calls.dern
        public Object call(Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            dern(args);
            return saneness().newInstance(Arrays.copyOf(args, args.length));
        }
    }

    /* JADX INFO: compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/wireman$saneness;", "Lkotlin/reflect/jvm/internal/calls/wireman;", "Ljava/lang/reflect/Constructor;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "", "args", "", NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class saneness extends wireman<Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        public saneness(Constructor<?> constructor) {
            Intrinsics.checkNotNullParameter(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : arytenoidectomy.arytenoidectomy(genericParameterTypes, 0, genericParameterTypes.length - 1)), null);
        }

        @Override // p002kotlin.reflect.jvm.internal.calls.dern
        public Object call(Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            dern(args);
            Constructor<?> constructorSaneness = saneness();
            dovishness dovishnessVar = new dovishness(2);
            dovishnessVar.saneness(args);
            dovishnessVar.attabal(null);
            return constructorSaneness.newInstance(dovishnessVar.wireman(new Object[dovishnessVar.dern()]));
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.calls.wireman$wireman, reason: collision with other inner class name and from kotlin metadata */
    /* JADX INFO: compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0006\b\u0001\u0010\u0004\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0005H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0006\b\u0001\u0010\u0004\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0005H\u0086\b¢\u0006\u0004\b\b\u0010\u0007J*\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0006\b\u0001\u0010\u0004\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0005H\u0086\b¢\u0006\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/wireman$wireman;", "", "<init>", "()V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "dropFirst", "([Ljava/lang/Object;)[Ljava/lang/Object;", "dropFirstAndLast", "dropLast", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public /* synthetic */ wireman(Member member, Type type, Class cls, Type[] typeArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(member, type, cls, typeArr);
    }

    @Override // p002kotlin.reflect.jvm.internal.calls.dern
    public List<Type> attabal() {
        return this.parameterTypes;
    }

    public void dern(Object[] objArr) {
        kotlin.reflect.jvm.internal.calls.dern.attabal.attabal(this, objArr);
    }

    @Override // p002kotlin.reflect.jvm.internal.calls.dern
    public final Type getReturnType() {
        return this.returnType;
    }

    public final Class<?> marial() {
        return this.instanceClass;
    }

    @Override // p002kotlin.reflect.jvm.internal.calls.dern
    public final M saneness() {
        return this.member;
    }

    public final void wireman(Object obj) {
        if (obj == null || !this.member.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0027  */
    public wireman(M m, Type type, Class<?> cls, Type[] typeArr) {
        List<Type> listUnconsolidated;
        this.member = m;
        this.returnType = type;
        this.instanceClass = cls;
        if (cls != null) {
            dovishness dovishnessVar = new dovishness(2);
            dovishnessVar.attabal(cls);
            dovishnessVar.saneness(typeArr);
            listUnconsolidated = adultoid.kowloon(dovishnessVar.wireman(new Type[dovishnessVar.dern()]));
            listUnconsolidated = listUnconsolidated == null ? polloi.unconsolidated(typeArr) : listUnconsolidated;
        }
        this.parameterTypes = listUnconsolidated;
    }
}
