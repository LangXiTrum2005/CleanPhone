package sealless;

import java.util.LinkedHashMap;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: AutofillTree.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"Lsealless/preprohormone;", "", "<init>", "()V", "", "id", "", "value", "", "saneness", "(ILjava/lang/String;)Lkotlin/Unit;", "", "Lsealless/rotuma;", "attabal", "Ljava/util/Map;", "()Ljava/util/Map;", "children", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class preprohormone {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Map<Integer, rotuma> children = new LinkedHashMap();

    public final Map<Integer, rotuma> attabal() {
        return this.children;
    }

    public final Unit saneness(int id, String value) {
        Function1<String, Unit> function1Dern;
        rotuma rotumaVar = this.children.get(Integer.valueOf(id));
        if (rotumaVar == null || (function1Dern = rotumaVar.dern()) == null) {
            return null;
        }
        function1Dern.invoke(value);
        return Unit.f29295attabal;
    }
}
