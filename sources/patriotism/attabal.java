package patriotism;

import babyless.beachfront;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: AdCache.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0006J\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\nJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\nJ\r\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0006J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\nJ\r\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0006¨\u0006\u0015"}, d2 = {"Lpatriotism/attabal;", "", "<init>", "()V", "", "attabal", "()J", "value", "", "competently", "(J)V", "wireman", "cutely", "", "marial", "()I", "beachfront", "impromptu", "saneness", "taiyuan", "dern", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f35069attabal = new attabal();

    public final long attabal() {
        return beachfront.impromptu("sp_ad_app_ad_current_value", 0L);
    }

    public final int beachfront() {
        int iCompetently = beachfront.competently("sp_ad_app_interstitial_times", 0) + 1;
        beachfront.attabal("sp_ad_app_interstitial_times", Integer.valueOf(iCompetently), null);
        return iCompetently;
    }

    public final void competently(long value) {
        beachfront.attabal("sp_ad_app_ad_current_value", Long.valueOf(value), null);
    }

    public final void cutely(long value) {
        beachfront.attabal("sp_ad_app_ad_total_value", Long.valueOf(value), null);
    }

    public final long dern() {
        return beachfront.impromptu("sp_ad_app_interstitial_total_value", 0L);
    }

    public final void impromptu(long value) {
        beachfront.attabal("sp_ad_app_interstitial_current_value", Long.valueOf(value), null);
    }

    public final int marial() {
        int iCompetently = beachfront.competently("sp_ad_app_ad_value_count", 0) + 1;
        beachfront.attabal("sp_ad_app_ad_value_count", Integer.valueOf(iCompetently), null);
        return iCompetently;
    }

    public final long saneness() {
        return beachfront.impromptu("sp_ad_app_interstitial_current_value", 0L);
    }

    public final void taiyuan(long value) {
        beachfront.attabal("sp_ad_app_interstitial_total_value", Long.valueOf(value), null);
    }

    public final long wireman() {
        return beachfront.impromptu("sp_ad_app_ad_total_value", 0L);
    }
}
