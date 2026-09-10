package milliradian;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: FontScaling.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00068&X§\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lmilliradian/apical;", "", "Lmilliradian/graveside;", "Lmilliradian/impromptu;", "impromptu", "(J)F", "", "kattegat", "()F", "getFontScale$annotations", "()V", "fontScale", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface apical {
    default float impromptu(long j) {
        if (!dovishness.competently(graveside.competently(j), dovishness.INSTANCE.saneness())) {
            formularize.saneness("Only Sp can convert to Px");
        }
        treadless.saneness sanenessVar = treadless.saneness.f38983attabal;
        if (!sanenessVar.beachfront(getFontScale())) {
            return impromptu.wireman(graveside.impromptu(j) * getFontScale());
        }
        treadless.attabal attabalVarSaneness = sanenessVar.saneness(getFontScale());
        float fImpromptu = graveside.impromptu(j);
        return attabalVarSaneness == null ? impromptu.wireman(fImpromptu * getFontScale()) : impromptu.wireman(attabalVarSaneness.attabal(fImpromptu));
    }

    /* JADX INFO: renamed from: kattegat */
    float getFontScale();
}
