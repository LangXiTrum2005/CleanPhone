package androidx.compose.ui.text.input;

import androidx.compose.ui.text.SaversKt;
import com.ironsource.C3414a2;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TextFieldValue.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0015B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB)\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "", "Landroidx/compose/ui/text/attabal;", "annotatedString", "Landroidx/compose/ui/text/competently;", "selection", "composition", "<init>", "(Landroidx/compose/ui/text/attabal;JLandroidx/compose/ui/text/competently;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "text", "(Ljava/lang/String;JLandroidx/compose/ui/text/competently;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "attabal", "Landroidx/compose/ui/text/attabal;", "()Landroidx/compose/ui/text/attabal;", "saneness", "J", "dern", "()J", "Landroidx/compose/ui/text/competently;", "()Landroidx/compose/ui/text/competently;", "wireman", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextFieldValue {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    public final androidx.compose.ui.text.attabal text;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata and from toString */
    public final androidx.compose.ui.text.competently composition;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    public final long selection;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final stratoscope.beachfront<TextFieldValue, Object> f7831marial = stratoscope.taiyuan.marial(new Function2<stratoscope.cutely, TextFieldValue, Object>() { // from class: androidx.compose.ui.text.input.TextFieldValue$Companion$Saver$1
        @Override // p002kotlin.jvm.functions.Function2
        public final Object invoke(stratoscope.cutely cutelyVar, TextFieldValue textFieldValue) {
            return p002kotlin.collections.adultoid.competently(SaversKt.preprohormone(textFieldValue.getText(), SaversKt.impromptu(), cutelyVar), SaversKt.preprohormone(androidx.compose.ui.text.competently.saneness(textFieldValue.getSelection()), SaversKt.cutely(androidx.compose.ui.text.competently.INSTANCE), cutelyVar));
        }
    }, new Function1<Object, TextFieldValue>() { // from class: androidx.compose.ui.text.input.TextFieldValue$Companion$Saver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p002kotlin.jvm.functions.Function1
        public final TextFieldValue invoke(Object obj) {
            Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            stratoscope.beachfront<androidx.compose.ui.text.attabal, Object> beachfrontVarImpromptu = SaversKt.impromptu();
            Boolean bool = Boolean.FALSE;
            androidx.compose.ui.text.competently competentlyVarSaneness = null;
            androidx.compose.ui.text.attabal attabalVarSaneness = ((!Intrinsics.wireman(obj2, bool) || (beachfrontVarImpromptu instanceof androidx.compose.ui.text.marial)) && obj2 != null) ? beachfrontVarImpromptu.saneness(obj2) : null;
            Intrinsics.beachfront(attabalVarSaneness);
            Object obj3 = list.get(1);
            stratoscope.beachfront<androidx.compose.ui.text.competently, Object> beachfrontVarCutely = SaversKt.cutely(androidx.compose.ui.text.competently.INSTANCE);
            if ((!Intrinsics.wireman(obj3, bool) || (beachfrontVarCutely instanceof androidx.compose.ui.text.marial)) && obj3 != null) {
                competentlyVarSaneness = beachfrontVarCutely.saneness(obj3);
            }
            Intrinsics.beachfront(competentlyVarSaneness);
            return new TextFieldValue(attabalVarSaneness, competentlyVarSaneness.getPackedValue(), (androidx.compose.ui.text.competently) null, 4, (DefaultConstructorMarker) null);
        }
    });

    public /* synthetic */ TextFieldValue(androidx.compose.ui.text.attabal attabalVar, long j, androidx.compose.ui.text.competently competentlyVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(attabalVar, j, competentlyVar);
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final androidx.compose.ui.text.attabal getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final long getSelection() {
        return this.selection;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextFieldValue)) {
            return false;
        }
        TextFieldValue textFieldValue = (TextFieldValue) other;
        return androidx.compose.ui.text.competently.marial(this.selection, textFieldValue.selection) && Intrinsics.wireman(this.composition, textFieldValue.composition) && Intrinsics.wireman(this.text, textFieldValue.text);
    }

    public int hashCode() {
        int iHashCode = ((this.text.hashCode() * 31) + androidx.compose.ui.text.competently.apical(this.selection)) * 31;
        androidx.compose.ui.text.competently competentlyVar = this.composition;
        return iHashCode + (competentlyVar != null ? androidx.compose.ui.text.competently.apical(competentlyVar.getPackedValue()) : 0);
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final androidx.compose.ui.text.competently getComposition() {
        return this.composition;
    }

    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.text) + "', selection=" + ((Object) androidx.compose.ui.text.competently.formularize(this.selection)) + ", composition=" + this.composition + ')';
    }

    public final String wireman() {
        return this.text.getText();
    }

    public /* synthetic */ TextFieldValue(String str, long j, androidx.compose.ui.text.competently competentlyVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, competentlyVar);
    }

    public TextFieldValue(androidx.compose.ui.text.attabal attabalVar, long j, androidx.compose.ui.text.competently competentlyVar) {
        this.text = attabalVar;
        this.selection = clubfoot.impromptu.dern(j, 0, wireman().length());
        this.composition = competentlyVar != null ? androidx.compose.ui.text.competently.saneness(clubfoot.impromptu.dern(competentlyVar.getPackedValue(), 0, wireman().length())) : null;
    }

    public /* synthetic */ TextFieldValue(androidx.compose.ui.text.attabal attabalVar, long j, androidx.compose.ui.text.competently competentlyVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(attabalVar, (i & 2) != 0 ? androidx.compose.ui.text.competently.INSTANCE.attabal() : j, (i & 4) != 0 ? null : competentlyVar, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ TextFieldValue(String str, long j, androidx.compose.ui.text.competently competentlyVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? androidx.compose.ui.text.competently.INSTANCE.attabal() : j, (i & 4) != 0 ? null : competentlyVar, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextFieldValue(String str, long j, androidx.compose.ui.text.competently competentlyVar) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        this(new androidx.compose.ui.text.attabal(str, null, null, 6, defaultConstructorMarker), j, competentlyVar, defaultConstructorMarker);
    }
}
