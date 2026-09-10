package sg.bigo.ads.api;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public class AdConfig {
    private static final String EMPTY_APP_KEY = "empty_app_id";
    public static final String EXTRA_KEY_HOST_RULES = "host_rules";
    public static final int GENDER_FEMALE = 1;
    public static final int GENDER_MALE = 2;
    private long activatedTime;
    private int age;
    private String appKey;
    private String channel;
    private boolean debug;
    private Map<String, String> extra;
    private int gender;

    public static class Builder {
        private String appKey;
        private String channel;
        private boolean debug;
        private final Map<String, String> extra;
        private int age = 0;
        private int gender = 0;
        private long activatedTime = 0;

        public Builder() {
            HashMap map = new HashMap();
            this.extra = map;
            if (TextUtils.isEmpty("")) {
                return;
            }
            map.put(AdConfig.EXTRA_KEY_HOST_RULES, "[{\"country\":\"ru\",\"host\":\"\"}]");
        }

        public Builder addExtra(String str, String str2) {
            if (!q.a((CharSequence) str) && !q.a((CharSequence) str2)) {
                this.extra.put(str, str2);
            }
            return this;
        }

        public AdConfig build() {
            AdConfig adConfig = new AdConfig();
            adConfig.appKey = TextUtils.isEmpty(this.appKey) ? AdConfig.EMPTY_APP_KEY : this.appKey;
            adConfig.channel = this.channel;
            adConfig.extra = this.extra;
            adConfig.debug = this.debug;
            adConfig.age = this.age;
            adConfig.gender = this.gender;
            adConfig.activatedTime = this.activatedTime;
            return adConfig;
        }

        public Builder setActivatedTime(long j) {
            this.activatedTime = j;
            return this;
        }

        public Builder setAge(int i2) {
            this.age = i2;
            return this;
        }

        public Builder setAppId(String str) {
            this.appKey = str;
            return this;
        }

        public Builder setChannel(String str) {
            this.channel = str;
            return this;
        }

        public Builder setDebug(boolean z2) {
            this.debug = z2;
            return this;
        }

        public Builder setGender(int i2) {
            this.gender = i2;
            return this;
        }
    }

    private AdConfig() {
    }

    public long getActivatedTime() {
        return this.activatedTime;
    }

    public int getAge() {
        return this.age;
    }

    public String getAppKey() {
        return this.appKey;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getExtra(String str) {
        return !q.a((CharSequence) str) ? this.extra.get(str) : "";
    }

    public int getGender() {
        return this.gender;
    }

    public boolean isDebug() {
        return this.debug;
    }
}
