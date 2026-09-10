package org.chromium.net.apihelpers;

import org.chromium.net.UrlResponseInfo;

/* JADX INFO: loaded from: classes5.dex */
public interface RedirectHandler {
    boolean shouldFollowRedirect(UrlResponseInfo urlResponseInfo, String str) throws Exception;
}
