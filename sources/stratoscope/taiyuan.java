package stratoscope;

import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Saver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a[\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00032\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006¢\u0006\u0004\b\t\u0010\n\"\"\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Original", "", "Saveable", "Lkotlin/Function2;", "Lstratoscope/cutely;", "save", "Lkotlin/Function1;", "restore", "Lstratoscope/beachfront;", "marial", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Lstratoscope/beachfront;", "attabal", "Lstratoscope/beachfront;", "AutoSaver", "runtime-saveable"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class taiyuan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final beachfront<Object, Object> f38168attabal = marial(new Function2() { // from class: stratoscope.competently
        @Override // p002kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return taiyuan.dern((cutely) obj, obj2);
        }
    }, new Function1() { // from class: stratoscope.impromptu
        @Override // p002kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return taiyuan.wireman(obj);
        }
    });

    /* JADX INFO: Add missing generic type declarations: [Saveable, Original] */
    /* JADX INFO: compiled from: Saver.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001d\u0010\u0004\u001a\u0004\u0018\u00018\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"stratoscope/taiyuan$attabal", "Lstratoscope/beachfront;", "Lstratoscope/cutely;", "value", "attabal", "(Lstratoscope/cutely;Ljava/lang/Object;)Ljava/lang/Object;", "saneness", "(Ljava/lang/Object;)Ljava/lang/Object;", "runtime-saveable"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class attabal<Original, Saveable> implements beachfront<Original, Saveable> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Function2<cutely, Original, Saveable> f38169attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ Function1<Saveable, Original> f38170saneness;

        /* JADX WARN: Multi-variable type inference failed */
        public attabal(Function2<? super cutely, ? super Original, ? extends Saveable> function2, Function1<? super Saveable, ? extends Original> function1) {
            this.f38169attabal = function2;
            this.f38170saneness = function1;
        }

        @Override // stratoscope.beachfront
        public Saveable attabal(cutely cutelyVar, Original original) {
            return this.f38169attabal.invoke(cutelyVar, original);
        }

        @Override // stratoscope.beachfront
        public Original saneness(Saveable value) {
            return this.f38170saneness.invoke(value);
        }
    }

    public static final <Original, Saveable> beachfront<Original, Saveable> marial(Function2<? super cutely, ? super Original, ? extends Saveable> function2, Function1<? super Saveable, ? extends Original> function1) {
        return new attabal(function2, function1);
    }

    public static final Object wireman(Object obj) {
        return obj;
    }

    public static final Object dern(cutely cutelyVar, Object obj) {
        return obj;
    }
}
