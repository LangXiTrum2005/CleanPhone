package com.squareup.picasso;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.p004ironsource.d9;
import java.io.IOException;
import okio.Okio;

/* JADX INFO: loaded from: classes6.dex */
class AssetRequestHandler extends RequestHandler {
    protected static final String ANDROID_ASSET = "android_asset";
    private static final int ASSET_PREFIX_LENGTH = 22;
    private AssetManager assetManager;
    private final Context context;
    private final Object lock = new Object();

    public AssetRequestHandler(Context context) {
        this.context = context;
    }

    public static String getFilePath(Request request) {
        return request.uri.toString().substring(ASSET_PREFIX_LENGTH);
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(Request request) {
        Uri uri = request.uri;
        return d9.h.f24719b.equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && ANDROID_ASSET.equals(uri.getPathSegments().get(0));
    }

    @Override // com.squareup.picasso.RequestHandler
    public RequestHandler.Result load(Request request, int i2) throws IOException {
        if (this.assetManager == null) {
            synchronized (this.lock) {
                try {
                    if (this.assetManager == null) {
                        this.assetManager = this.context.getAssets();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return new RequestHandler.Result(Okio.i(this.assetManager.open(getFilePath(request))), Picasso.LoadedFrom.DISK);
    }
}
