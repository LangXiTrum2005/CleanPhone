package ads_mobile_sdk;

import saneness.hel;
import saneness.overspeculate;
import saneness.prescient;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class i20 extends xm0 {
    private static final i20 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 9;
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 4;
    public static final int h = 5;
    public static final int i = 6;
    public static final int j = 7;
    public static final int k = 8;
    public static final int l = 10;
    public static final int m = 11;
    public static final int n = 12;
    public static final int o = 13;
    public static final int p = 14;
    private int bitField0_;
    private boolean isRetargeting_;
    private boolean isSubframeReferrerUrlRemoved_;
    private boolean isSubframeUrlRemoved_;
    private boolean isUrlRemovedByPolicy_;
    private boolean maybeLaunchedByExternalApplication_;
    private int navigationInitiation_;
    private double navigationTimeMsec_;
    private String url_ = "";
    private String mainFrameUrl_ = "";
    private int type_ = 4;
    private prescient ipAddresses_ = xm0.h();
    private String referrerUrl_ = "";
    private String referrerMainFrameUrl_ = "";
    private prescient serverRedirectChain_ = xm0.h();

    static {
        i20 i20Var = new i20();
        DEFAULT_INSTANCE = i20Var;
        xm0.a(i20.class, i20Var);
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i2, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i2);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"bitField0_", "url_", "type_", g20.a, "ipAddresses_", "referrerUrl_", "referrerMainFrameUrl_", "isRetargeting_", "navigationTimeMsec_", "serverRedirectChain_", f20.class, "mainFrameUrl_", "navigationInitiation_", c20.a, "maybeLaunchedByExternalApplication_", "isSubframeUrlRemoved_", "isSubframeReferrerUrlRemoved_", "isUrlRemovedByPolicy_"});
        }
        if (iAttabal == 3) {
            return new i20();
        }
        if (iAttabal == 4) {
            return new overspeculate();
        }
        if (iAttabal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iAttabal != 6) {
            throw null;
        }
        hel helVar = PARSER;
        if (helVar != null) {
            return helVar;
        }
        synchronized (i20.class) {
            try {
                wm0Var = PARSER;
                if (wm0Var == null) {
                    wm0Var = new wm0(DEFAULT_INSTANCE);
                    PARSER = wm0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return wm0Var;
    }
}
