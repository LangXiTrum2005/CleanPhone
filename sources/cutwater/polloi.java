package cutwater;

import java.lang.annotation.Annotation;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JsonElementSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u0012\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lfastidiously/beachfront;", "encoder", "", "impromptu", "(Lfastidiously/beachfront;)V", "Lfastidiously/marial;", "decoder", "competently", "(Lfastidiously/marial;)V", "Lcutwater/competently;", "wireman", "(Lfastidiously/marial;)Lcutwater/competently;", "Lcutwater/molybdenite;", "marial", "(Lfastidiously/beachfront;)Lcutwater/molybdenite;", "Lkotlin/Function0;", "Lbristol/beachfront;", "deferred", "beachfront", "(Lkotlin/jvm/functions/Function0;)Lbristol/beachfront;", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class polloi {

    /* JADX INFO: compiled from: JsonElementSerializers.kt */
    @Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0016\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"cutwater/polloi$attabal", "Lbristol/beachfront;", "", "index", "", "marial", "(I)Ljava/lang/String;", "name", "dern", "(Ljava/lang/String;)I", "", "", "beachfront", "(I)Ljava/util/List;", "competently", "(I)Lbristol/beachfront;", "", "taiyuan", "(I)Z", "attabal", "Lpatroclinal/taiyuan;", "()Lbristol/beachfront;", "original", "impromptu", "()Ljava/lang/String;", "serialName", "Lbristol/impassible;", "getKind", "()Lbristol/impassible;", "kind", "wireman", "()I", "elementsCount", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class attabal implements bristol.beachfront {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final patroclinal.taiyuan original;

        public attabal(Function0<? extends bristol.beachfront> function0) {
            this.original = p002kotlin.saneness.saneness(function0);
        }

        public final bristol.beachfront attabal() {
            return (bristol.beachfront) this.original.getValue();
        }

        @Override // bristol.beachfront
        public List<Annotation> beachfront(int index) {
            return attabal().beachfront(index);
        }

        @Override // bristol.beachfront
        public bristol.beachfront competently(int index) {
            return attabal().competently(index);
        }

        @Override // bristol.beachfront
        public int dern(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return attabal().dern(name);
        }

        @Override // bristol.beachfront
        public List<Annotation> getAnnotations() {
            return bristol.beachfront.attabal.attabal(this);
        }

        @Override // bristol.beachfront
        public bristol.impassible getKind() {
            return attabal().getKind();
        }

        @Override // bristol.beachfront
        /* JADX INFO: renamed from: impromptu */
        public String getSerialName() {
            return attabal().getSerialName();
        }

        @Override // bristol.beachfront
        /* JADX INFO: renamed from: isInline */
        public boolean getIsInline() {
            return bristol.beachfront.attabal.saneness(this);
        }

        @Override // bristol.beachfront
        public String marial(int index) {
            return attabal().marial(index);
        }

        @Override // bristol.beachfront
        public boolean saneness() {
            return bristol.beachfront.attabal.dern(this);
        }

        @Override // bristol.beachfront
        public boolean taiyuan(int index) {
            return attabal().taiyuan(index);
        }

        @Override // bristol.beachfront
        /* JADX INFO: renamed from: wireman */
        public int getElementsCount() {
            return attabal().getElementsCount();
        }
    }

    public static final bristol.beachfront beachfront(Function0<? extends bristol.beachfront> function0) {
        return new attabal(function0);
    }

    public static final void competently(fastidiously.marial marialVar) {
        wireman(marialVar);
    }

    public static final void impromptu(fastidiously.beachfront beachfrontVar) {
        marial(beachfrontVar);
    }

    public static final molybdenite marial(fastidiously.beachfront beachfrontVar) {
        Intrinsics.checkNotNullParameter(beachfrontVar, "<this>");
        molybdenite molybdeniteVar = beachfrontVar instanceof molybdenite ? (molybdenite) beachfrontVar : null;
        if (molybdeniteVar != null) {
            return molybdeniteVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + p002kotlin.jvm.internal.polloi.saneness(beachfrontVar.getClass()));
    }

    public static final competently wireman(fastidiously.marial marialVar) {
        Intrinsics.checkNotNullParameter(marialVar, "<this>");
        competently competentlyVar = marialVar instanceof competently ? (competently) marialVar : null;
        if (competentlyVar != null) {
            return competentlyVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + p002kotlin.jvm.internal.polloi.saneness(marialVar.getClass()));
    }
}
