package sg.bigo.ads.api;

import sg.bigo.ads.api.Ad;

/* JADX INFO: loaded from: classes7.dex */
public interface AdLoadListener<T extends Ad> {
    void onAdLoaded(T t);

    void onError(AdError adError);
}
