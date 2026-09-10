package org.chromium.net.apihelpers;

import org.chromium.net.UrlResponseInfo;

/* JADX INFO: loaded from: classes5.dex */
public class RedirectHandlers {
    private RedirectHandlers() {
    }

    public static RedirectHandler alwaysFollow() {
        return new RedirectHandler() { // from class: org.chromium.net.apihelpers.saneness
            @Override // org.chromium.net.apihelpers.RedirectHandler
            public final boolean shouldFollowRedirect(UrlResponseInfo urlResponseInfo, String str) {
                return RedirectHandlers.attabal(urlResponseInfo, str);
            }
        };
    }

    public static /* synthetic */ boolean attabal(UrlResponseInfo urlResponseInfo, String str) {
        return true;
    }

    public static RedirectHandler neverFollow() {
        return new RedirectHandler() { // from class: org.chromium.net.apihelpers.attabal
            @Override // org.chromium.net.apihelpers.RedirectHandler
            public final boolean shouldFollowRedirect(UrlResponseInfo urlResponseInfo, String str) {
                return RedirectHandlers.saneness(urlResponseInfo, str);
            }
        };
    }

    public static /* synthetic */ boolean saneness(UrlResponseInfo urlResponseInfo, String str) {
        return false;
    }
}
