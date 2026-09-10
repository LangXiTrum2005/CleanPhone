package com.android.billingclient.api;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static final BillingResult A;
    public static final BillingResult B;
    public static final BillingResult C;
    public static final BillingResult D;
    public static final BillingResult E;
    public static final BillingResult F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BillingResult f7267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final BillingResult f7268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final BillingResult f7269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final BillingResult f7270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final BillingResult f7271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final BillingResult f7272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BillingResult f7273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final BillingResult f7274h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final BillingResult f7275i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final BillingResult f7276j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final BillingResult f7277k;
    public static final BillingResult l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final BillingResult f7278m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final BillingResult f7279n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final BillingResult f7280o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final BillingResult f7281p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final BillingResult f7282q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final BillingResult f7283r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final BillingResult f7284s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final BillingResult f7285t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final BillingResult f7286u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final BillingResult f7287v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final BillingResult f7288w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final BillingResult f7289x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final BillingResult f7290y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final BillingResult f7291z;

    static {
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(3);
        builderNewBuilder.setDebugMessage("Google Play In-app Billing API version is less than 3");
        builderNewBuilder.build();
        BillingResult.Builder builderNewBuilder2 = BillingResult.newBuilder();
        builderNewBuilder2.setResponseCode(3);
        builderNewBuilder2.setDebugMessage("Google Play In-app Billing API version is less than 9");
        f7267a = builderNewBuilder2.build();
        f7268b = wi.d.g(3, "Billing service unavailable on device.");
        f7269c = wi.d.g(2, "Billing service unavailable on device.");
        f7270d = wi.d.g(5, "Client is already in the process of connecting to billing service.");
        BillingResult.Builder builderNewBuilder3 = BillingResult.newBuilder();
        builderNewBuilder3.setResponseCode(5);
        builderNewBuilder3.setDebugMessage("The list of SKUs can't be empty.");
        builderNewBuilder3.build();
        BillingResult.Builder builderNewBuilder4 = BillingResult.newBuilder();
        builderNewBuilder4.setResponseCode(5);
        builderNewBuilder4.setDebugMessage("SKU type can't be empty.");
        builderNewBuilder4.build();
        BillingResult.Builder builderNewBuilder5 = BillingResult.newBuilder();
        builderNewBuilder5.setResponseCode(5);
        builderNewBuilder5.setDebugMessage("Product type can't be empty.");
        f7271e = builderNewBuilder5.build();
        f7272f = wi.d.g(-2, "Client does not support extra params.");
        f7273g = wi.d.g(5, "Invalid purchase token.");
        f7274h = wi.d.g(6, "An internal error occurred.");
        BillingResult.Builder builderNewBuilder6 = BillingResult.newBuilder();
        builderNewBuilder6.setResponseCode(5);
        builderNewBuilder6.setDebugMessage("SKU can't be null.");
        builderNewBuilder6.build();
        BillingResult.Builder builderNewBuilder7 = BillingResult.newBuilder();
        builderNewBuilder7.setResponseCode(0);
        f7275i = builderNewBuilder7.build();
        f7276j = wi.d.g(-1, "Service connection is disconnected.");
        f7277k = wi.d.g(2, "Timeout communicating with service.");
        l = wi.d.g(-2, "Client does not support subscriptions.");
        f7278m = wi.d.g(-2, "Client does not support subscriptions update.");
        BillingResult.Builder builderNewBuilder8 = BillingResult.newBuilder();
        builderNewBuilder8.setResponseCode(-2);
        builderNewBuilder8.setDebugMessage("Client does not support get purchase history.");
        builderNewBuilder8.build();
        BillingResult.Builder builderNewBuilder9 = BillingResult.newBuilder();
        builderNewBuilder9.setResponseCode(-2);
        builderNewBuilder9.setDebugMessage("Client does not support price change confirmation.");
        f7279n = builderNewBuilder9.build();
        f7280o = wi.d.g(-2, "Play Store version installed does not support cross selling products.");
        f7281p = wi.d.g(-2, "Client does not support multi-item purchases.");
        f7282q = wi.d.g(-2, "Client does not support offer_id_token.");
        f7283r = wi.d.g(-2, "Client does not support ProductDetails.");
        f7284s = wi.d.g(-2, "Client does not support in-app messages.");
        BillingResult.Builder builderNewBuilder10 = BillingResult.newBuilder();
        builderNewBuilder10.setResponseCode(-2);
        builderNewBuilder10.setDebugMessage("Client does not support user choice billing.");
        builderNewBuilder10.build();
        BillingResult.Builder builderNewBuilder11 = BillingResult.newBuilder();
        builderNewBuilder11.setResponseCode(-2);
        builderNewBuilder11.setDebugMessage("Play Store version installed does not support external offer.");
        f7285t = builderNewBuilder11.build();
        f7286u = wi.d.g(-2, "Play Store version installed does not support multi-item purchases with season pass in one cart.");
        f7287v = wi.d.g(-2, "Play Store version installed does not support querying AutoPay plan purchase.");
        f7288w = wi.d.g(-2, "Play Store version installed does not support including suspended subscriptions.");
        f7289x = wi.d.g(5, "Unknown feature");
        f7290y = wi.d.g(-2, "Play Store version installed does not support get billing config.");
        f7291z = wi.d.g(-2, "Query product details with serialized docid is not supported.");
        A = wi.d.g(-2, "Play Store version installed does not support launching external offer flow.");
        B = wi.d.g(4, "Item is unavailable for purchase.");
        C = wi.d.g(-2, "Query product details with developer specified account is not supported.");
        D = wi.d.g(-2, "Play Store version installed does not support alternative billing only.");
        E = wi.d.g(5, "To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.");
        F = wi.d.g(6, "An error occurred while retrieving billing override.");
        BillingResult.Builder builderNewBuilder12 = BillingResult.newBuilder();
        builderNewBuilder12.setResponseCode(-2);
        builderNewBuilder12.setDebugMessage("Play Store version installed does not support the provided billing program.");
        builderNewBuilder12.build();
    }

    public static BillingResult a(int i10, String str) {
        return wi.d.g(i10, str);
    }
}
