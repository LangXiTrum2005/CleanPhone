package minuteness;

import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PermissionUtils.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R.\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR.\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR.\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\fR.\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\b\u001a\u0004\b\u0017\u0010\n\"\u0004\b\u0018\u0010\f¨\u0006\u001a"}, d2 = {"Lminuteness/marial;", "", "<init>", "()V", "Lkotlin/Function1;", "", "", "attabal", "Lkotlin/jvm/functions/Function1;", "competently", "()Lkotlin/jvm/functions/Function1;", "triweekly", "(Lkotlin/jvm/functions/Function1;)V", "granted", "saneness", "beachfront", "impassible", "denied", "dern", "taiyuan", "kowloon", "noMoreAsk", "wireman", "impromptu", "setNoDeclare", "noDeclare", "tools_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public Function1<? super String, Unit> granted = new Function1() { // from class: minuteness.attabal
        @Override // p002kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return marial.cutely((String) obj);
        }
    };

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public Function1<? super String, Unit> denied = new Function1() { // from class: minuteness.saneness
        @Override // p002kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return marial.marial((String) obj);
        }
    };

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public Function1<? super String, Unit> noMoreAsk = new Function1() { // from class: minuteness.dern
        @Override // p002kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return marial.formularize((String) obj);
        }
    };

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public Function1<? super String, Unit> noDeclare = new Function1() { // from class: minuteness.wireman
        @Override // p002kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return marial.apical((String) obj);
        }
    };

    public static final Unit apical(String permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        throw new RuntimeException("请声明以下权限: " + permission);
    }

    public static final Unit cutely(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f29295attabal;
    }

    public static final Unit formularize(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f29295attabal;
    }

    public static final Unit marial(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f29295attabal;
    }

    public final Function1<String, Unit> beachfront() {
        return this.denied;
    }

    public final Function1<String, Unit> competently() {
        return this.granted;
    }

    public final void impassible(Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.denied = function1;
    }

    public final Function1<String, Unit> impromptu() {
        return this.noDeclare;
    }

    public final void kowloon(Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.noMoreAsk = function1;
    }

    public final Function1<String, Unit> taiyuan() {
        return this.noMoreAsk;
    }

    public final void triweekly(Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.granted = function1;
    }
}
