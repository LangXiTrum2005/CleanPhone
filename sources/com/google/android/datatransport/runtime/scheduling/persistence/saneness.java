package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: compiled from: AutoValue_PersistedEvent.java */
/* JADX INFO: loaded from: classes2.dex */
public final class saneness extends apical {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final long f19373attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final lehua.taiyuan f19374dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final lehua.arytenoidectomy f19375saneness;

    public saneness(long j, lehua.arytenoidectomy arytenoidectomyVar, lehua.taiyuan taiyuanVar) {
        this.f19373attabal = j;
        if (arytenoidectomyVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f19375saneness = arytenoidectomyVar;
        if (taiyuanVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f19374dern = taiyuanVar;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.apical
    public long dern() {
        return this.f19373attabal;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof apical) {
            apical apicalVar = (apical) obj;
            if (this.f19373attabal == apicalVar.dern() && this.f19375saneness.equals(apicalVar.wireman()) && this.f19374dern.equals(apicalVar.saneness())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.f19373attabal;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f19375saneness.hashCode()) * 1000003) ^ this.f19374dern.hashCode();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.apical
    public lehua.taiyuan saneness() {
        return this.f19374dern;
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f19373attabal + ", transportContext=" + this.f19375saneness + ", event=" + this.f19374dern + "}";
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.apical
    public lehua.arytenoidectomy wireman() {
        return this.f19375saneness;
    }
}
