package sealless;

import androidx.compose.ui.autofill.AutofillType;
import com.ironsource.C3414a2;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Autofill.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u000bJ\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR$\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R%\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001e"}, d2 = {"Lsealless/rotuma;", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "Landroidx/compose/ui/autofill/AutofillType;", "attabal", "Ljava/util/List;", "()Ljava/util/List;", "autofillTypes", "Lsupplicat/taiyuan;", "saneness", "Lsupplicat/taiyuan;", "()Lsupplicat/taiyuan;", "setBoundingBox", "(Lsupplicat/taiyuan;)V", "boundingBox", "Lkotlin/Function1;", "", "", "dern", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "onFill", "wireman", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class rotuma {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final List<AutofillType> autofillTypes;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final Function1<String, Unit> onFill;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public supplicat.taiyuan boundingBox;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final int f37447marial = 8;

    public final List<AutofillType> attabal() {
        return this.autofillTypes;
    }

    public final Function1<String, Unit> dern() {
        return this.onFill;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof rotuma)) {
            return false;
        }
        rotuma rotumaVar = (rotuma) other;
        return Intrinsics.wireman(this.autofillTypes, rotumaVar.autofillTypes) && Intrinsics.wireman(this.boundingBox, rotumaVar.boundingBox) && this.onFill == rotumaVar.onFill;
    }

    public int hashCode() {
        int iHashCode = this.autofillTypes.hashCode() * 31;
        supplicat.taiyuan taiyuanVar = this.boundingBox;
        int iHashCode2 = (iHashCode + (taiyuanVar != null ? taiyuanVar.hashCode() : 0)) * 31;
        Function1<String, Unit> function1 = this.onFill;
        return iHashCode2 + (function1 != null ? function1.hashCode() : 0);
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final supplicat.taiyuan getBoundingBox() {
        return this.boundingBox;
    }
}
