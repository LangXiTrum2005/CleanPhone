package formularism;

import com.ironsource.C3460cc;
import com.ironsource.Db;
import com.ironsource.Y9;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.unity3d.services.core.network.model.HttpRequest;
import duvetyn.adultoid;
import duvetyn.supplicat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.ByteString;
import p002kotlin.Metadata;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.arytenoidectomy;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Hpack.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0006\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0015"}, d2 = {"Lformularism/saneness;", "", "<init>", "()V", "Lokio/ByteString;", "name", "attabal", "(Lokio/ByteString;)Lokio/ByteString;", "", "", "wireman", "()Ljava/util/Map;", "", "Lformularism/attabal;", "saneness", "[Lformularism/attabal;", "dern", "()[Lformularism/attabal;", "STATIC_HEADER_TABLE", "Ljava/util/Map;", "NAME_TO_FIRST_INDEX", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final saneness f26378attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static final Map<ByteString, Integer> NAME_TO_FIRST_INDEX;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final formularism.attabal[] STATIC_HEADER_TABLE;

    static {
        saneness sanenessVar = new saneness();
        f26378attabal = sanenessVar;
        formularism.attabal attabalVar = new formularism.attabal(formularism.attabal.f26308impromptu, "");
        ByteString byteString = formularism.attabal.f26309marial;
        formularism.attabal attabalVar2 = new formularism.attabal(byteString, C3460cc.a);
        formularism.attabal attabalVar3 = new formularism.attabal(byteString, C3460cc.b);
        ByteString byteString2 = formularism.attabal.f26305beachfront;
        formularism.attabal attabalVar4 = new formularism.attabal(byteString2, "/");
        formularism.attabal attabalVar5 = new formularism.attabal(byteString2, "/index.html");
        ByteString byteString3 = formularism.attabal.f26306competently;
        formularism.attabal attabalVar6 = new formularism.attabal(byteString3, "http");
        formularism.attabal attabalVar7 = new formularism.attabal(byteString3, HttpRequest.DEFAULT_SCHEME);
        ByteString byteString4 = formularism.attabal.f26311wireman;
        STATIC_HEADER_TABLE = new formularism.attabal[]{attabalVar, attabalVar2, attabalVar3, attabalVar4, attabalVar5, attabalVar6, attabalVar7, new formularism.attabal(byteString4, "200"), new formularism.attabal(byteString4, "204"), new formularism.attabal(byteString4, "206"), new formularism.attabal(byteString4, "304"), new formularism.attabal(byteString4, "400"), new formularism.attabal(byteString4, "404"), new formularism.attabal(byteString4, "500"), new formularism.attabal("accept-charset", ""), new formularism.attabal("accept-encoding", "gzip, deflate"), new formularism.attabal("accept-language", ""), new formularism.attabal("accept-ranges", ""), new formularism.attabal("accept", ""), new formularism.attabal("access-control-allow-origin", ""), new formularism.attabal(Y9.m, ""), new formularism.attabal("allow", ""), new formularism.attabal("authorization", ""), new formularism.attabal("cache-control", ""), new formularism.attabal("content-disposition", ""), new formularism.attabal("content-encoding", ""), new formularism.attabal("content-language", ""), new formularism.attabal("content-length", ""), new formularism.attabal("content-location", ""), new formularism.attabal("content-range", ""), new formularism.attabal("content-type", ""), new formularism.attabal("cookie", ""), new formularism.attabal("date", ""), new formularism.attabal(DownloadModel.ETAG, ""), new formularism.attabal("expect", ""), new formularism.attabal("expires", ""), new formularism.attabal("from", ""), new formularism.attabal("host", ""), new formularism.attabal("if-match", ""), new formularism.attabal("if-modified-since", ""), new formularism.attabal("if-none-match", ""), new formularism.attabal("if-range", ""), new formularism.attabal("if-unmodified-since", ""), new formularism.attabal("last-modified", ""), new formularism.attabal("link", ""), new formularism.attabal("location", ""), new formularism.attabal("max-forwards", ""), new formularism.attabal("proxy-authenticate", ""), new formularism.attabal("proxy-authorization", ""), new formularism.attabal("range", ""), new formularism.attabal("referer", ""), new formularism.attabal(ToolBar.REFRESH, ""), new formularism.attabal("retry-after", ""), new formularism.attabal(Db.a, ""), new formularism.attabal("set-cookie", ""), new formularism.attabal("strict-transport-security", ""), new formularism.attabal("transfer-encoding", ""), new formularism.attabal("user-agent", ""), new formularism.attabal("vary", ""), new formularism.attabal("via", ""), new formularism.attabal("www-authenticate", "")};
        NAME_TO_FIRST_INDEX = sanenessVar.wireman();
    }

    public final ByteString attabal(ByteString name) throws IOException {
        Intrinsics.checkNotNullParameter(name, "name");
        int size = name.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            byte b = name.getByte(i);
            if (65 <= b && b <= 90) {
                throw new IOException(Intrinsics.arytenoidectomy("PROTOCOL_ERROR response malformed: mixed case name: ", name.utf8()));
            }
            i = i2;
        }
        return name;
    }

    public final formularism.attabal[] dern() {
        return STATIC_HEADER_TABLE;
    }

    public final Map<ByteString, Integer> saneness() {
        return NAME_TO_FIRST_INDEX;
    }

    public final Map<ByteString, Integer> wireman() {
        formularism.attabal[] attabalVarArr = STATIC_HEADER_TABLE;
        LinkedHashMap linkedHashMap = new LinkedHashMap(attabalVarArr.length);
        int length = attabalVarArr.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            formularism.attabal[] attabalVarArr2 = STATIC_HEADER_TABLE;
            if (!linkedHashMap.containsKey(attabalVarArr2[i].name)) {
                linkedHashMap.put(attabalVarArr2[i].name, Integer.valueOf(i));
            }
            i = i2;
        }
        Map<ByteString, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(result)");
        return mapUnmodifiableMap;
    }

    /* JADX INFO: compiled from: Hpack.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u000fJ\u000f\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u000fJ\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010\u001bJ\u0017\u0010 \u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010\u001eJ\u000f\u0010!\u001a\u00020\rH\u0002¢\u0006\u0004\b!\u0010\u000fJ\u0017\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010\u001eJ\u000f\u0010$\u001a\u00020\rH\u0002¢\u0006\u0004\b$\u0010\u000fJ\u0017\u0010%\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0004H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010\u001c\u001a\u00020\u0004H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\nH\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0004H\u0002¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010/R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010/R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\n008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00101R\u0014\u0010\u0003\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00104R\u001e\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000b\u00106R\u0016\u00108\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010/R\u0016\u00109\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b+\u0010/R\u0016\u0010:\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b(\u0010/¨\u0006;"}, d2 = {"Lformularism/saneness$attabal;", "", "Lduvetyn/supplicat;", "source", "", "headerTableSizeSetting", "maxDynamicTableByteCount", "<init>", "(Lduvetyn/supplicat;II)V", "", "Lformularism/attabal;", "marial", "()Ljava/util/List;", "", "apical", "()V", "firstByte", "prefixMask", "impassible", "(II)I", "Lokio/ByteString;", "cutely", "()Lokio/ByteString;", "attabal", "saneness", "bytesToRecover", "wireman", "(I)I", "index", "formularize", "(I)V", "dern", "arytenoidectomy", "monoploid", "nameIndex", "triweekly", "kowloon", "beachfront", "(I)Lokio/ByteString;", "", "impromptu", "(I)Z", "entry", "competently", "(ILformularism/attabal;)V", "taiyuan", "()I", "I", "", "Ljava/util/List;", "headerList", "Lduvetyn/beachfront;", "Lduvetyn/beachfront;", "", "[Lformularism/attabal;", "dynamicTable", "nextHeaderIndex", "headerCount", "dynamicTableByteCount", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final int headerTableSizeSetting;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
        public int nextHeaderIndex;

        /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
        public int headerCount;

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
        public final List<formularism.attabal> headerList;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
        public int dynamicTableByteCount;

        /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
        public formularism.attabal[] dynamicTable;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public int maxDynamicTableByteCount;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
        public final duvetyn.beachfront source;

        public attabal(supplicat source, int i, int i2) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.headerTableSizeSetting = i;
            this.maxDynamicTableByteCount = i2;
            this.headerList = new ArrayList();
            this.source = adultoid.wireman(source);
            formularism.attabal[] attabalVarArr = new formularism.attabal[8];
            this.dynamicTable = attabalVarArr;
            this.nextHeaderIndex = attabalVarArr.length - 1;
        }

        public final void apical() throws IOException {
            while (!this.source.exhausted()) {
                int iWireman = hereditist.wireman.wireman(this.source.readByte(), 255);
                if (iWireman == 128) {
                    throw new IOException("index == 0");
                }
                if ((iWireman & 128) == 128) {
                    formularize(impassible(iWireman, 127) - 1);
                } else if (iWireman == 64) {
                    kowloon();
                } else if ((iWireman & 64) == 64) {
                    triweekly(impassible(iWireman, 63) - 1);
                } else if ((iWireman & 32) == 32) {
                    int iImpassible = impassible(iWireman, 31);
                    this.maxDynamicTableByteCount = iImpassible;
                    if (iImpassible < 0 || iImpassible > this.headerTableSizeSetting) {
                        throw new IOException(Intrinsics.arytenoidectomy("Invalid dynamic table size update ", Integer.valueOf(this.maxDynamicTableByteCount)));
                    }
                    attabal();
                } else if (iWireman == 16 || iWireman == 0) {
                    monoploid();
                } else {
                    arytenoidectomy(impassible(iWireman, 15) - 1);
                }
            }
        }

        public final void arytenoidectomy(int index) throws IOException {
            this.headerList.add(new formularism.attabal(beachfront(index), cutely()));
        }

        public final void attabal() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i < i2) {
                if (i == 0) {
                    saneness();
                } else {
                    wireman(i2 - i);
                }
            }
        }

        public final ByteString beachfront(int index) throws IOException {
            if (impromptu(index)) {
                return saneness.f26378attabal.dern()[index].name;
            }
            int iDern = dern(index - saneness.f26378attabal.dern().length);
            if (iDern >= 0) {
                formularism.attabal[] attabalVarArr = this.dynamicTable;
                if (iDern < attabalVarArr.length) {
                    formularism.attabal attabalVar = attabalVarArr[iDern];
                    Intrinsics.beachfront(attabalVar);
                    return attabalVar.name;
                }
            }
            throw new IOException(Intrinsics.arytenoidectomy("Header index too large ", Integer.valueOf(index + 1)));
        }

        public final void competently(int index, formularism.attabal entry) {
            this.headerList.add(entry);
            int i = entry.hpackSize;
            if (index != -1) {
                formularism.attabal attabalVar = this.dynamicTable[dern(index)];
                Intrinsics.beachfront(attabalVar);
                i -= attabalVar.hpackSize;
            }
            int i2 = this.maxDynamicTableByteCount;
            if (i > i2) {
                saneness();
                return;
            }
            int iWireman = wireman((this.dynamicTableByteCount + i) - i2);
            if (index == -1) {
                int i3 = this.headerCount + 1;
                formularism.attabal[] attabalVarArr = this.dynamicTable;
                if (i3 > attabalVarArr.length) {
                    formularism.attabal[] attabalVarArr2 = new formularism.attabal[attabalVarArr.length * 2];
                    System.arraycopy(attabalVarArr, 0, attabalVarArr2, attabalVarArr.length, attabalVarArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = attabalVarArr2;
                }
                int i4 = this.nextHeaderIndex;
                this.nextHeaderIndex = i4 - 1;
                this.dynamicTable[i4] = entry;
                this.headerCount++;
            } else {
                this.dynamicTable[index + dern(index) + iWireman] = entry;
            }
            this.dynamicTableByteCount += i;
        }

        public final ByteString cutely() throws IOException {
            int iTaiyuan = taiyuan();
            boolean z = (iTaiyuan & 128) == 128;
            long jImpassible = impassible(iTaiyuan, 127);
            if (!z) {
                return this.source.readByteString(jImpassible);
            }
            duvetyn.wireman wiremanVar = new duvetyn.wireman();
            taiyuan.f26399attabal.saneness(this.source, jImpassible, wiremanVar);
            return wiremanVar.readByteString();
        }

        public final int dern(int index) {
            return this.nextHeaderIndex + 1 + index;
        }

        public final void formularize(int index) throws IOException {
            if (impromptu(index)) {
                this.headerList.add(saneness.f26378attabal.dern()[index]);
                return;
            }
            int iDern = dern(index - saneness.f26378attabal.dern().length);
            if (iDern >= 0) {
                formularism.attabal[] attabalVarArr = this.dynamicTable;
                if (iDern < attabalVarArr.length) {
                    List<formularism.attabal> list = this.headerList;
                    formularism.attabal attabalVar = attabalVarArr[iDern];
                    Intrinsics.beachfront(attabalVar);
                    list.add(attabalVar);
                    return;
                }
            }
            throw new IOException(Intrinsics.arytenoidectomy("Header index too large ", Integer.valueOf(index + 1)));
        }

        public final int impassible(int firstByte, int prefixMask) throws IOException {
            int i = firstByte & prefixMask;
            if (i < prefixMask) {
                return i;
            }
            int i2 = 0;
            while (true) {
                int iTaiyuan = taiyuan();
                if ((iTaiyuan & 128) == 0) {
                    return prefixMask + (iTaiyuan << i2);
                }
                prefixMask += (iTaiyuan & 127) << i2;
                i2 += 7;
            }
        }

        public final boolean impromptu(int index) {
            return index >= 0 && index <= saneness.f26378attabal.dern().length - 1;
        }

        public final void kowloon() throws IOException {
            competently(-1, new formularism.attabal(saneness.f26378attabal.attabal(cutely()), cutely()));
        }

        public final List<formularism.attabal> marial() {
            List<formularism.attabal> listMolet = CollectionsKt.molet(this.headerList);
            this.headerList.clear();
            return listMolet;
        }

        public final void monoploid() throws IOException {
            this.headerList.add(new formularism.attabal(saneness.f26378attabal.attabal(cutely()), cutely()));
        }

        public final void saneness() {
            arytenoidectomy.dovishness(this.dynamicTable, null, 0, 0, 6, null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        public final int taiyuan() throws IOException {
            return hereditist.wireman.wireman(this.source.readByte(), 255);
        }

        public final void triweekly(int nameIndex) throws IOException {
            competently(-1, new formularism.attabal(beachfront(nameIndex), cutely()));
        }

        public final int wireman(int bytesToRecover) {
            int i;
            int i2 = 0;
            if (bytesToRecover > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i = this.nextHeaderIndex;
                    if (length < i || bytesToRecover <= 0) {
                        break;
                    }
                    formularism.attabal attabalVar = this.dynamicTable[length];
                    Intrinsics.beachfront(attabalVar);
                    int i3 = attabalVar.hpackSize;
                    bytesToRecover -= i3;
                    this.dynamicTableByteCount -= i3;
                    this.headerCount--;
                    i2++;
                }
                formularism.attabal[] attabalVarArr = this.dynamicTable;
                System.arraycopy(attabalVarArr, i + 1, attabalVarArr, i + 1 + i2, this.headerCount);
                this.nextHeaderIndex += i2;
            }
            return i2;
        }

        public /* synthetic */ attabal(supplicat supplicatVar, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(supplicatVar, i, (i3 & 4) != 0 ? i : i2);
        }
    }

    /* JADX INFO: renamed from: formularism.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Hpack.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0011\n\u0002\b\b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u000bH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\rH\u0002¢\u0006\u0004\b#\u0010\u001cR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010&R\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010$R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010%R\u0016\u0010)\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010$R\u001e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0*8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010+R\u0016\u0010-\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010$R\u0016\u0010/\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b.\u0010$R\u0016\u00101\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b0\u0010$¨\u00062"}, d2 = {"Lformularism/saneness$saneness;", "", "", "headerTableSizeSetting", "", "useCompression", "Lduvetyn/wireman;", "out", "<init>", "(IZLduvetyn/wireman;)V", "", "Lformularism/attabal;", "headerBlock", "", "competently", "(Ljava/util/List;)V", "value", "prefixMask", "bits", "impromptu", "(III)V", "Lokio/ByteString;", "data", "beachfront", "(Lokio/ByteString;)V", "marial", "(I)V", "saneness", "()V", "bytesToRecover", "dern", "(I)I", "entry", "wireman", "(Lformularism/attabal;)V", "attabal", "I", "Z", "Lduvetyn/wireman;", "smallestHeaderTableSizeSetting", "emitDynamicTableSizeUpdate", "maxDynamicTableByteCount", "", "[Lformularism/attabal;", "dynamicTable", "nextHeaderIndex", "taiyuan", "headerCount", "cutely", "dynamicTableByteCount", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class C0610saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public int headerTableSizeSetting;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
        public int maxDynamicTableByteCount;

        /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
        public formularism.attabal[] dynamicTable;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
        public int dynamicTableByteCount;

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
        public final duvetyn.wireman out;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
        public int nextHeaderIndex;

        /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
        public boolean emitDynamicTableSizeUpdate;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public final boolean useCompression;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
        public int headerCount;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
        public int smallestHeaderTableSizeSetting;

        public C0610saneness(int i, boolean z, duvetyn.wireman out) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.headerTableSizeSetting = i;
            this.useCompression = z;
            this.out = out;
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.maxDynamicTableByteCount = i;
            formularism.attabal[] attabalVarArr = new formularism.attabal[8];
            this.dynamicTable = attabalVarArr;
            this.nextHeaderIndex = attabalVarArr.length - 1;
        }

        public final void attabal() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i < i2) {
                if (i == 0) {
                    saneness();
                } else {
                    dern(i2 - i);
                }
            }
        }

        public final void beachfront(ByteString data) throws IOException {
            Intrinsics.checkNotNullParameter(data, "data");
            if (this.useCompression) {
                taiyuan taiyuanVar = taiyuan.f26399attabal;
                if (taiyuanVar.wireman(data) < data.size()) {
                    duvetyn.wireman wiremanVar = new duvetyn.wireman();
                    taiyuanVar.dern(data, wiremanVar);
                    ByteString byteString = wiremanVar.readByteString();
                    impromptu(byteString.size(), 127, 128);
                    this.out.sensatory(byteString);
                    return;
                }
            }
            impromptu(data.size(), 127, 0);
            this.out.sensatory(data);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0079  */
        public final void competently(List<formularism.attabal> headerBlock) throws IOException {
            int length;
            int length2;
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            if (this.emitDynamicTableSizeUpdate) {
                int i = this.smallestHeaderTableSizeSetting;
                if (i < this.maxDynamicTableByteCount) {
                    impromptu(i, 31, 32);
                }
                this.emitDynamicTableSizeUpdate = false;
                this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
                impromptu(this.maxDynamicTableByteCount, 31, 32);
            }
            int size = headerBlock.size();
            int i2 = 0;
            while (i2 < size) {
                int i3 = i2 + 1;
                formularism.attabal attabalVar = headerBlock.get(i2);
                ByteString asciiLowercase = attabalVar.name.toAsciiLowercase();
                ByteString byteString = attabalVar.value;
                saneness sanenessVar = saneness.f26378attabal;
                Integer num = sanenessVar.saneness().get(asciiLowercase);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (2 > length2 || length2 >= 8) {
                        length = length2;
                        length2 = -1;
                    } else if (Intrinsics.wireman(sanenessVar.dern()[iIntValue].value, byteString)) {
                        length = length2;
                    } else if (Intrinsics.wireman(sanenessVar.dern()[length2].value, byteString)) {
                        length = length2;
                        length2 = iIntValue + 2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int i4 = this.nextHeaderIndex + 1;
                    int length3 = this.dynamicTable.length;
                    while (i4 < length3) {
                        int i5 = i4 + 1;
                        formularism.attabal attabalVar2 = this.dynamicTable[i4];
                        Intrinsics.beachfront(attabalVar2);
                        if (Intrinsics.wireman(attabalVar2.name, asciiLowercase)) {
                            formularism.attabal attabalVar3 = this.dynamicTable[i4];
                            Intrinsics.beachfront(attabalVar3);
                            if (Intrinsics.wireman(attabalVar3.value, byteString)) {
                                length2 = saneness.f26378attabal.dern().length + (i4 - this.nextHeaderIndex);
                                break;
                            } else if (length == -1) {
                                length = saneness.f26378attabal.dern().length + (i4 - this.nextHeaderIndex);
                            }
                        }
                        i4 = i5;
                    }
                }
                if (length2 != -1) {
                    impromptu(length2, 127, 128);
                } else if (length == -1) {
                    this.out.writeByte(64);
                    beachfront(asciiLowercase);
                    beachfront(byteString);
                    wireman(attabalVar);
                } else if (!asciiLowercase.startsWith(formularism.attabal.f26307dern) || Intrinsics.wireman(formularism.attabal.f26308impromptu, asciiLowercase)) {
                    impromptu(length, 63, 64);
                    beachfront(byteString);
                    wireman(attabalVar);
                } else {
                    impromptu(length, 15, 0);
                    beachfront(byteString);
                }
                i2 = i3;
            }
        }

        public final int dern(int bytesToRecover) {
            int i;
            int i2 = 0;
            if (bytesToRecover > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i = this.nextHeaderIndex;
                    if (length < i || bytesToRecover <= 0) {
                        break;
                    }
                    formularism.attabal attabalVar = this.dynamicTable[length];
                    Intrinsics.beachfront(attabalVar);
                    bytesToRecover -= attabalVar.hpackSize;
                    int i3 = this.dynamicTableByteCount;
                    formularism.attabal attabalVar2 = this.dynamicTable[length];
                    Intrinsics.beachfront(attabalVar2);
                    this.dynamicTableByteCount = i3 - attabalVar2.hpackSize;
                    this.headerCount--;
                    i2++;
                }
                formularism.attabal[] attabalVarArr = this.dynamicTable;
                System.arraycopy(attabalVarArr, i + 1, attabalVarArr, i + 1 + i2, this.headerCount);
                formularism.attabal[] attabalVarArr2 = this.dynamicTable;
                int i4 = this.nextHeaderIndex;
                Arrays.fill(attabalVarArr2, i4 + 1, i4 + 1 + i2, (Object) null);
                this.nextHeaderIndex += i2;
            }
            return i2;
        }

        public final void impromptu(int value, int prefixMask, int bits) {
            if (value < prefixMask) {
                this.out.writeByte(value | bits);
                return;
            }
            this.out.writeByte(bits | prefixMask);
            int i = value - prefixMask;
            while (i >= 128) {
                this.out.writeByte(128 | (i & 127));
                i >>>= 7;
            }
            this.out.writeByte(i);
        }

        public final void marial(int headerTableSizeSetting) {
            this.headerTableSizeSetting = headerTableSizeSetting;
            int iMin = Math.min(headerTableSizeSetting, 16384);
            int i = this.maxDynamicTableByteCount;
            if (i == iMin) {
                return;
            }
            if (iMin < i) {
                this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, iMin);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = iMin;
            attabal();
        }

        public final void saneness() {
            arytenoidectomy.dovishness(this.dynamicTable, null, 0, 0, 6, null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        public final void wireman(formularism.attabal entry) {
            int i = entry.hpackSize;
            int i2 = this.maxDynamicTableByteCount;
            if (i > i2) {
                saneness();
                return;
            }
            dern((this.dynamicTableByteCount + i) - i2);
            int i3 = this.headerCount + 1;
            formularism.attabal[] attabalVarArr = this.dynamicTable;
            if (i3 > attabalVarArr.length) {
                formularism.attabal[] attabalVarArr2 = new formularism.attabal[attabalVarArr.length * 2];
                System.arraycopy(attabalVarArr, 0, attabalVarArr2, attabalVarArr.length, attabalVarArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = attabalVarArr2;
            }
            int i4 = this.nextHeaderIndex;
            this.nextHeaderIndex = i4 - 1;
            this.dynamicTable[i4] = entry;
            this.headerCount++;
            this.dynamicTableByteCount += i;
        }

        public /* synthetic */ C0610saneness(int i, boolean z, duvetyn.wireman wiremanVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 4096 : i, (i2 & 2) != 0 ? true : z, wiremanVar);
        }
    }
}
