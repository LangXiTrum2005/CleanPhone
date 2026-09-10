package com.google.common.net;

import com.google.android.exoplayer2.analytics.f;
import com.google.common.base.Ascii;
import com.google.common.base.CharMatcher;
import com.google.common.base.Charsets;
import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimaps;
import com.google.errorprone.annotations.Immutable;
import com.smartdigimkt.x.d;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.thinkup.core.o.m;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
@Immutable
@ElementTypesAreNonnullByDefault
public final class MediaType {
    public static final ImmutableListMultimap f = ImmutableListMultimap.y(Ascii.b(Charsets.f19705c.name()));
    public static final CharMatcher g = CharMatcher.e().b(CharMatcher.l().p()).b(CharMatcher.k()).b(CharMatcher.c("()<>@,;:\\\"/[]?=").p());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final HashMap f20041h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Joiner.MapJoiner f20042i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImmutableListMultimap f20045c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20046e;

    public static final class Tokenizer {
    }

    static {
        CharMatcher.e().b(CharMatcher.c("\"\\\r").p());
        CharMatcher.c(" \t\r\n");
        f20041h = new HashMap();
        a("*", "*");
        a("text", "*");
        a(d.c.k, "*");
        a("audio", "*");
        a("video", "*");
        a("application", "*");
        a("font", "*");
        b("text", "cache-manifest");
        b("text", "css");
        b("text", "csv");
        b("text", "html");
        b("text", "calendar");
        b("text", "plain");
        b("text", "javascript");
        b("text", "tab-separated-values");
        b("text", "vcard");
        b("text", "vnd.wap.wml");
        b("text", "xml");
        b("text", "vtt");
        a(d.c.k, "bmp");
        a(d.c.k, "x-canon-crw");
        a(d.c.k, "gif");
        a(d.c.k, "vnd.microsoft.icon");
        a(d.c.k, "jpeg");
        a(d.c.k, "png");
        a(d.c.k, "vnd.adobe.photoshop");
        b(d.c.k, "svg+xml");
        a(d.c.k, "tiff");
        a(d.c.k, "webp");
        a(d.c.k, "heif");
        a(d.c.k, "jp2");
        a("audio", "mp4");
        a("audio", "mpeg");
        a("audio", "ogg");
        a("audio", "webm");
        a("audio", "l16");
        a("audio", "l24");
        a("audio", "basic");
        a("audio", "aac");
        a("audio", "vorbis");
        a("audio", "x-ms-wma");
        a("audio", "x-ms-wax");
        a("audio", "vnd.rn-realaudio");
        a("audio", "vnd.wave");
        a("video", "mp4");
        a("video", "mpeg");
        a("video", "ogg");
        a("video", "quicktime");
        a("video", "webm");
        a("video", "x-ms-wmv");
        a("video", "x-flv");
        a("video", "3gpp");
        a("video", "3gpp2");
        b("application", "xml");
        b("application", "atom+xml");
        a("application", "x-bzip2");
        b("application", "dart");
        a("application", "vnd.apple.pkpass");
        a("application", "vnd.ms-fontobject");
        a("application", "epub+zip");
        a("application", "x-www-form-urlencoded");
        a("application", "pkcs12");
        a("application", "binary");
        a("application", "geo+json");
        a("application", "x-gzip");
        a("application", "hal+json");
        b("application", "javascript");
        a("application", "jose");
        a("application", "jose+json");
        b("application", "json");
        a("application", "jwt");
        b("application", "manifest+json");
        a("application", "vnd.google-earth.kml+xml");
        a("application", "vnd.google-earth.kmz");
        a("application", "mbox");
        a("application", "x-apple-aspen-config");
        a("application", "vnd.ms-excel");
        a("application", "vnd.ms-outlook");
        a("application", "vnd.ms-powerpoint");
        a("application", "msword");
        a("application", "dash+xml");
        a("application", "wasm");
        a("application", "x-nacl");
        a("application", "x-pnacl");
        a("application", "octet-stream");
        a("application", "ogg");
        a("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");
        a("application", "vnd.openxmlformats-officedocument.presentationml.presentation");
        a("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        a("application", "vnd.oasis.opendocument.graphics");
        a("application", "vnd.oasis.opendocument.presentation");
        a("application", "vnd.oasis.opendocument.spreadsheet");
        a("application", "vnd.oasis.opendocument.text");
        b("application", "opensearchdescription+xml");
        a("application", m.m);
        a("application", "postscript");
        a("application", "protobuf");
        b("application", "rdf+xml");
        b("application", "rtf");
        a("application", "font-sfnt");
        a("application", "x-shockwave-flash");
        a("application", "vnd.sketchup.skp");
        b("application", "soap+xml");
        a("application", "x-tar");
        a("application", "font-woff");
        a("application", "font-woff2");
        b("application", "xhtml+xml");
        b("application", "xrd+xml");
        a("application", "zip");
        a("font", "collection");
        a("font", "otf");
        a("font", "sfnt");
        a("font", "ttf");
        a("font", "woff");
        a("font", "woff2");
        f20042i = new Joiner.MapJoiner(new Joiner("; "));
    }

    public MediaType(String str, String str2, ImmutableListMultimap immutableListMultimap) {
        this.f20043a = str;
        this.f20044b = str2;
        this.f20045c = immutableListMultimap;
    }

    public static void a(String str, String str2) {
        MediaType mediaType = new MediaType(str, str2, ImmutableListMultimap.x());
        f20041h.put(mediaType, mediaType);
    }

    public static void b(String str, String str2) {
        MediaType mediaType = new MediaType(str, str2, f);
        f20041h.put(mediaType, mediaType);
        Optional.i(Charsets.f19705c);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MediaType)) {
            return false;
        }
        MediaType mediaType = (MediaType) obj;
        if (this.f20043a.equals(mediaType.f20043a) && this.f20044b.equals(mediaType.f20044b)) {
            return ((AbstractMap) Maps.k(this.f20045c.u(), new a(0))).equals(Maps.k(mediaType.f20045c.u(), new a(0)));
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f20046e;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = Arrays.hashCode(new Object[]{this.f20043a, this.f20044b, Maps.k(this.f20045c.u(), new a(0))});
        this.f20046e = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f20043a);
        sb.append(IOUtils.DIR_SEPARATOR_UNIX);
        sb.append(this.f20044b);
        ImmutableListMultimap immutableListMultimap = this.f20045c;
        if (!immutableListMultimap.isEmpty()) {
            sb.append("; ");
            Collection collectionD = Multimaps.a(immutableListMultimap, new f(29)).d();
            Joiner.MapJoiner mapJoiner = f20042i;
            mapJoiner.getClass();
            try {
                mapJoiner.a(sb, collectionD.iterator());
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }
        String string = sb.toString();
        this.d = string;
        return string;
    }
}
