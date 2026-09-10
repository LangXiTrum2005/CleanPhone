package org.chromium.net.apihelpers;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: loaded from: classes5.dex */
public abstract class StringCronetCallback extends InMemoryTransformCronetCallback<String> {
    private static final String CONTENT_TYPE_HEADER_NAME = "Content-Type";

    private Charset getCharsetFromHeaders(UrlResponseInfo urlResponseInfo) {
        Iterator<String> it = urlResponseInfo.getAllHeaders().get("Content-Type").iterator();
        String str = null;
        while (it.hasNext()) {
            ContentTypeParametersParser contentTypeParametersParser = new ContentTypeParametersParser(it.next());
            while (contentTypeParametersParser.hasMore()) {
                try {
                    Map.Entry<String, String> nextParameter = contentTypeParametersParser.getNextParameter();
                    nextParameter.getKey();
                    String value = nextParameter.getValue();
                    if (str != null && !value.equalsIgnoreCase(str)) {
                        throw new IllegalArgumentException("Multiple charsets provided: " + value + " and " + str);
                    }
                    str = value;
                } catch (ContentTypeParametersParser.ContentTypeParametersParserException unused) {
                    continue;
                }
            }
        }
        return str != null ? Charset.forName(str) : Charset.defaultCharset();
    }

    @Override // org.chromium.net.apihelpers.InMemoryTransformCronetCallback
    public StringCronetCallback addCompletionListener(CronetRequestCompletionListener<? super String> cronetRequestCompletionListener) {
        super.addCompletionListener((CronetRequestCompletionListener) cronetRequestCompletionListener);
        return this;
    }

    @Override // org.chromium.net.apihelpers.InMemoryTransformCronetCallback
    public String transformBodyBytes(UrlResponseInfo urlResponseInfo, byte[] bArr) {
        return new String(bArr, getCharsetFromHeaders(urlResponseInfo));
    }
}
