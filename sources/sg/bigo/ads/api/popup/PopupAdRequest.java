package sg.bigo.ads.api.popup;

import sg.bigo.ads.api.b;
import sg.bigo.ads.api.c;

/* JADX INFO: loaded from: classes7.dex */
public class PopupAdRequest extends b<PopupAdRequest> {

    public static class Builder extends c<Builder, PopupAdRequest> {
        @Override // sg.bigo.ads.api.c
        public PopupAdRequest createAdRequest() {
            return new PopupAdRequest(this.mSlotId, this.mServerBidPayload);
        }
    }

    public PopupAdRequest(String str, String str2) {
        super(str, str2);
    }

    @Override // sg.bigo.ads.api.b
    public final int c() {
        return 20;
    }
}
