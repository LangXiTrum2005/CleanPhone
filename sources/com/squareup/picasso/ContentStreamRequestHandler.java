package com.squareup.picasso;

import android.content.Context;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import okio.Okio;

/* JADX INFO: loaded from: classes6.dex */
class ContentStreamRequestHandler extends RequestHandler {
    final Context context;

    public ContentStreamRequestHandler(Context context) {
        this.context = context;
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(Request request) {
        return "content".equals(request.uri.getScheme());
    }

    public InputStream getInputStream(Request request) throws FileNotFoundException {
        return this.context.getContentResolver().openInputStream(request.uri);
    }

    @Override // com.squareup.picasso.RequestHandler
    public RequestHandler.Result load(Request request, int i2) throws IOException {
        return new RequestHandler.Result(Okio.i(getInputStream(request)), Picasso.LoadedFrom.DISK);
    }
}
