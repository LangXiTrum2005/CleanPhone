package mathsort;

import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import supplicat.taiyuan;

/* JADX INFO: compiled from: TextActionModeCallback.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0000\u0018\u00002\u00020\u0001Bk\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u001aR*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001c\u0010\u0010\"\u0004\b\u001d\u0010\u001aR*\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u000e\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010\u001aR*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u000e\u001a\u0004\b\"\u0010\u0010\"\u0004\b#\u0010\u001a¨\u0006$"}, d2 = {"Lmathsort/attabal;", "", "Lkotlin/Function0;", "", "onActionModeDestroy", "Lsupplicat/taiyuan;", "rect", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "<init>", "(Lkotlin/jvm/functions/Function0;Lsupplicat/taiyuan;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "attabal", "Lkotlin/jvm/functions/Function0;", "getOnActionModeDestroy", "()Lkotlin/jvm/functions/Function0;", "saneness", "Lsupplicat/taiyuan;", "getRect", "()Lsupplicat/taiyuan;", "setRect", "(Lsupplicat/taiyuan;)V", "dern", "getOnCopyRequested", "setOnCopyRequested", "(Lkotlin/jvm/functions/Function0;)V", "wireman", "getOnPasteRequested", "setOnPasteRequested", "marial", "getOnCutRequested", "setOnCutRequested", "beachfront", "getOnSelectAllRequested", "setOnSelectAllRequested", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Function0<Unit> onActionModeDestroy;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public Function0<Unit> onSelectAllRequested;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public Function0<Unit> onCopyRequested;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public Function0<Unit> onCutRequested;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public taiyuan rect;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public Function0<Unit> onPasteRequested;

    public attabal(Function0<Unit> function0, taiyuan taiyuanVar, Function0<Unit> function1, Function0<Unit> function2, Function0<Unit> function3, Function0<Unit> function4) {
        this.onActionModeDestroy = function0;
        this.rect = taiyuanVar;
        this.onCopyRequested = function1;
        this.onPasteRequested = function2;
        this.onCutRequested = function3;
        this.onSelectAllRequested = function4;
    }

    public /* synthetic */ attabal(Function0 function0, taiyuan taiyuanVar, Function0 function1, Function0 function2, Function0 function3, Function0 function4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function0, (i & 2) != 0 ? taiyuan.INSTANCE.attabal() : taiyuanVar, (i & 4) != 0 ? null : function1, (i & 8) != 0 ? null : function2, (i & 16) != 0 ? null : function3, (i & 32) != 0 ? null : function4);
    }
}
