package com.mbridge.msdk.playercommon.exoplayer2.offline;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.offline.FilterableManifest;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.ParsingLoadable;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class FilteringManifestParser<T extends FilterableManifest<T, K>, K> implements ParsingLoadable.Parser<T> {
    private final ParsingLoadable.Parser<T> parser;
    private final List<K> trackKeys;

    public FilteringManifestParser(ParsingLoadable.Parser<T> parser, List<K> list) {
        this.parser = parser;
        this.trackKeys = list;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.ParsingLoadable.Parser
    public T parse(Uri uri, InputStream inputStream) throws IOException {
        T t10 = this.parser.parse(uri, inputStream);
        List<K> list = this.trackKeys;
        return (list == null || list.isEmpty()) ? t10 : (T) t10.copy(this.trackKeys);
    }
}
