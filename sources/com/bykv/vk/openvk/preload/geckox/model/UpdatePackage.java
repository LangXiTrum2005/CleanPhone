package com.bykv.vk.openvk.preload.geckox.model;

import com.bykv.vk.openvk.preload.falconx.a.a;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class UpdatePackage {
    private String accessKey;
    private String channel;
    private int channelIndex;
    private Content content;
    private String groupName;
    private long localVersion;
    private int packageType;
    private long version;

    public static class Content {
        private Package fullPackage;
        private Package patch;
        private Strategy strategy;

        public Content fromJson(JSONObject jSONObject) {
            JSONObject jSONObjectOptJSONObject;
            JSONObject jSONObjectOptJSONObject2;
            JSONObject jSONObjectOptJSONObject3;
            if (jSONObject != null) {
                try {
                    if (jSONObject.has("package") && (jSONObjectOptJSONObject3 = jSONObject.optJSONObject("package")) != null) {
                        Package r3 = new Package();
                        this.fullPackage = r3;
                        r3.fromJson(jSONObjectOptJSONObject3);
                    }
                    if (jSONObject.has("patch") && (jSONObjectOptJSONObject2 = jSONObject.optJSONObject("patch")) != null) {
                        Package r2 = new Package();
                        this.patch = r2;
                        r2.fromJson(jSONObjectOptJSONObject2);
                    }
                    if (jSONObject.has("strategies") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("strategies")) != null) {
                        Strategy strategy = new Strategy();
                        this.strategy = strategy;
                        strategy.fromJson(jSONObjectOptJSONObject);
                    }
                } catch (Throwable unused) {
                }
            }
            return this;
        }
    }

    public static final class FileType {
        public static final int COMPRESSED_FILE = 0;
        public static final int MY_ARCHIVE_FILE = 2;
        public static final int UNCOMPRESSED_FILE = 1;
    }

    public static class Package {
        long id;
        long length;
        String md5;

        @Deprecated
        String url;
        List<String> urlList;

        public Package() {
        }

        public Package fromJson(JSONObject jSONObject) {
            JSONArray jSONArrayOptJSONArray;
            if (jSONObject != null) {
                try {
                    if (jSONObject.has("id")) {
                        this.id = jSONObject.optLong("id");
                    }
                    if (jSONObject.has("url")) {
                        this.url = (String) a.a(jSONObject, "url", String.class);
                    }
                    if (jSONObject.has("url_list") && (jSONArrayOptJSONArray = jSONObject.optJSONArray("url_list")) != null && jSONArrayOptJSONArray.length() > 0) {
                        this.urlList = new ArrayList();
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                            this.urlList.add(jSONArrayOptJSONArray.optString(i2));
                        }
                    }
                    if (jSONObject.has("md5")) {
                        this.md5 = (String) a.a(jSONObject, "md5", String.class);
                    }
                    if (jSONObject.has("size")) {
                        this.length = jSONObject.optLong("size");
                    }
                } catch (Throwable unused) {
                }
            }
            return this;
        }

        public long getId() {
            return this.id;
        }

        public long getLength() {
            return this.length;
        }

        public String getMd5() {
            return this.md5;
        }

        public String getUrl() {
            return this.url;
        }

        public List<String> getUrlList() {
            return this.urlList;
        }

        public void setId(int i2) {
            this.id = i2;
        }

        public void setMd5(String str) {
            this.md5 = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public void setUrlList(List<String> list) {
            this.urlList = list;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Package{url='");
            sb.append(this.url);
            sb.append("', md5='");
            return android.support.v4.media.a.r(sb, this.md5, "'}");
        }

        public Package(int i2, List<String> list, String str) {
            this.id = i2;
            this.urlList = list;
            this.md5 = str;
        }
    }

    public static class Strategy {
        private boolean deleteIfFail;
        private boolean deleteOldPackageBeforeDownload;
        private boolean needUnzip;

        public Strategy() {
        }

        public Strategy fromJson(JSONObject jSONObject) {
            if (jSONObject != null) {
                try {
                    if (jSONObject.has("del_if_download_failed")) {
                        this.deleteIfFail = jSONObject.optBoolean("del_if_download_failed");
                    }
                    if (jSONObject.has("del_old_pkg_before_download")) {
                        this.deleteOldPackageBeforeDownload = jSONObject.optBoolean("del_old_pkg_before_download");
                    }
                    if (jSONObject.has("need_unzip")) {
                        this.needUnzip = jSONObject.optBoolean("need_unzip");
                    }
                } catch (Throwable unused) {
                }
            }
            return this;
        }

        public boolean isDeleteIfFail() {
            return this.deleteIfFail;
        }

        public boolean isDeleteOldPackageBeforeDownload() {
            return this.deleteOldPackageBeforeDownload;
        }

        public boolean isNeedUnzip() {
            return this.needUnzip;
        }

        public void setDeleteIfFail(boolean z2) {
            this.deleteIfFail = z2;
        }

        public void setDeleteOldPackageBeforeDownload(boolean z2) {
            this.deleteOldPackageBeforeDownload = z2;
        }

        public void setNeedUnzip(boolean z2) {
            this.needUnzip = z2;
        }

        public Strategy(int i2) {
            this.deleteIfFail = i2 == 1;
        }
    }

    public UpdatePackage() {
    }

    public UpdatePackage fromJson(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject != null) {
            try {
                if (jSONObject.has("group_name")) {
                    this.groupName = (String) a.a(jSONObject, "group_name", String.class);
                }
                if (jSONObject.has("channel_index")) {
                    this.channelIndex = jSONObject.optInt("channel_index");
                }
                if (jSONObject.has("package_version")) {
                    this.version = jSONObject.optLong("package_version");
                }
                if (jSONObject.has("channel")) {
                    this.channel = (String) a.a(jSONObject, "channel", String.class);
                }
                if (jSONObject.has("content") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("content")) != null) {
                    Content content = new Content();
                    this.content = content;
                    content.fromJson(jSONObjectOptJSONObject);
                }
                if (jSONObject.has("localVersion")) {
                    this.localVersion = jSONObject.optLong("localVersion");
                }
                if (jSONObject.has("accessKey")) {
                    this.accessKey = (String) a.a(jSONObject, "accessKey", String.class);
                }
                if (jSONObject.has("package_type")) {
                    this.packageType = jSONObject.optInt("package_type");
                }
            } catch (Throwable unused) {
            }
        }
        return this;
    }

    public String getAccessKey() {
        return this.accessKey;
    }

    public String getChannel() {
        return this.channel;
    }

    public int getChannelIndex() {
        return this.channelIndex;
    }

    public Package getFullPackage() {
        return this.content.fullPackage;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public long getLocalVersion() {
        return this.localVersion;
    }

    public int getPackageType() {
        return this.packageType;
    }

    public Package getPatch() {
        return this.content.patch;
    }

    public Strategy getStrategy() {
        return this.content.strategy;
    }

    public long getVersion() {
        return this.version;
    }

    public boolean isFullUpdate() {
        return getFullPackage() != null && getFullPackage().getUrlList().size() > 0;
    }

    public boolean isPatchUpdate() {
        return getPatch() != null && getPatch().getUrlList().size() > 0;
    }

    public void setAccessKey(String str) {
        this.accessKey = str;
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public void setChannelIndex(int i2) {
        this.channelIndex = i2;
    }

    public void setFullPackage(Package r2) {
        this.content.fullPackage = r2;
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public void setLocalVersion(long j) {
        this.localVersion = j;
    }

    public void setPatch(Package r2) {
        this.content.patch = r2;
    }

    public void setStrategy(Strategy strategy) {
        this.content.strategy = strategy;
    }

    public void setVersion(long j) {
        this.version = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UpdatePackage{version=");
        sb.append(this.version);
        sb.append(", channel='");
        sb.append(this.channel);
        sb.append("', content=");
        sb.append(this.content);
        sb.append(", packageType=");
        return android.support.v4.media.a.p(sb, this.packageType, AbstractJsonLexerKt.END_OBJ);
    }

    public UpdatePackage(long j, String str, Package r4, Package r5) {
        this.version = j;
        this.channel = str;
        Content content = new Content();
        this.content = content;
        content.fullPackage = r4;
        this.content.patch = r5;
    }
}
