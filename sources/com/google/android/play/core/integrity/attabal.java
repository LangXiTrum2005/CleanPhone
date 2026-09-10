package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class attabal extends arytenoidectomy {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public String f21435attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public trm f21436saneness;

    @Override // com.google.android.play.core.integrity.arytenoidectomy
    public final arytenoidectomy attabal(trm trmVar) {
        this.f21436saneness = trmVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.arytenoidectomy
    public final monoploid dern() {
        trm trmVar;
        String str = this.f21435attabal;
        if (str != null && (trmVar = this.f21436saneness) != null) {
            return new monoploid(str, trmVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f21435attabal == null) {
            sb.append(" token");
        }
        if (this.f21436saneness == null) {
            sb.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.play.core.integrity.arytenoidectomy
    public final arytenoidectomy saneness(String str) {
        this.f21435attabal = str;
        return this;
    }
}
