package sg.bigo.ads.api;

/* JADX INFO: loaded from: classes7.dex */
public interface Ad extends Comparable<Ad> {
    public static final int CLICK_ACTY_SOURCE_FROM_CURRENT_ACTIVITY = 2;
    public static final int CLICK_ACTY_SOURCE_FROM_SHOW = 1;
    public static final int CLICK_ACTY_SOURCE_FROM_VIEW = 3;
    public static final int INTERSTITIAL_SHOW_METHOD_NON_NULL_ACTIVITY = 2;
    public static final int INTERSTITIAL_SHOW_METHOD_NULL_ACTIVITY = 3;
    public static final int INTERSTITIAL_SHOW_METHOD_OLD = 1;

    void destroy();

    AdBid getBid();

    String getCreativeId();

    String getExtraInfo(String str);

    boolean isExpired();

    void setAdInteractionListener(AdInteractionListener adInteractionListener);
}
