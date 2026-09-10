package cuirassed;

import androidx.compose.runtime.hardpan;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.technofreak;
import com.ironsource.C3414a2;
import com.ironsource.X3;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ComposableLambda.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u001d\u0010\u000b\u001a\u00020\n*\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016¨\u0006\u0018"}, d2 = {"", "bits", "slot", "attabal", "(II)I", "beachfront", "(I)I", "dern", "Landroidx/compose/runtime/hardpan;", C3414a2.d, "", "marial", "(Landroidx/compose/runtime/hardpan;Landroidx/compose/runtime/hardpan;)Z", X3.i.W, "tracked", "", "block", "Lcuirassed/attabal;", "saneness", "(IZLjava/lang/Object;)Lcuirassed/attabal;", "wireman", "(IZLjava/lang/Object;Landroidx/compose/runtime/taiyuan;I)Lcuirassed/attabal;", "Ljava/lang/Object;", "lambdaKey", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Object f24280attabal = new Object();

    public static final int attabal(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static final int beachfront(int i) {
        return attabal(1, i);
    }

    public static final int dern(int i) {
        return attabal(2, i);
    }

    public static final boolean marial(hardpan hardpanVar, hardpan hardpanVar2) {
        if (hardpanVar == null) {
            return true;
        }
        if (!(hardpanVar instanceof technofreak) || !(hardpanVar2 instanceof technofreak)) {
            return false;
        }
        technofreak technofreakVar = (technofreak) hardpanVar;
        return !technofreakVar.graveside() || Intrinsics.wireman(hardpanVar, hardpanVar2) || Intrinsics.wireman(technofreakVar.getAnchor(), ((technofreak) hardpanVar2).getAnchor());
    }

    public static final attabal saneness(int i, boolean z, Object obj) {
        return new ComposableLambdaImpl(i, z, obj);
    }

    public static final attabal wireman(int i, boolean z, Object obj, androidx.compose.runtime.taiyuan taiyuanVar, int i2) {
        if (androidx.compose.runtime.polloi.grimness()) {
            androidx.compose.runtime.polloi.mathsort(-1573003438, i2, -1, "androidx.compose.runtime.internal.rememberComposableLambda (ComposableLambda.kt:1371)");
        }
        Object objApical = taiyuanVar.apical();
        if (objApical == androidx.compose.runtime.taiyuan.INSTANCE.attabal()) {
            objApical = new ComposableLambdaImpl(i, z, obj);
            taiyuanVar.competently(objApical);
        }
        ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) objApical;
        composableLambdaImpl.formularize(obj);
        if (androidx.compose.runtime.polloi.grimness()) {
            androidx.compose.runtime.polloi.peridotite();
        }
        return composableLambdaImpl;
    }
}
