package com.umeng.crash;

/* JADX INFO: loaded from: classes3.dex */
public class UCrashConfig {
    boolean anrEnable;
    boolean anrTraceHkEnable;
    String backupDir;
    boolean backupEnable;
    UCrashCallback callback;
    boolean customEnable;
    int customFileSaveLimit;
    int customFileUploadLimit;
    boolean customUploadImmediately;
    boolean javaCrashEnable;
    boolean javaCrashRethrow;
    boolean javaDumpAllThreads;
    boolean logEnable;
    boolean nativeCrashEnable;
    boolean nativeCrashRethrow;
    boolean nativeDumpAllThreads;
    String url;

    public static class Builder {
        private boolean anrEnable;
        private boolean anrTraceHkEnable;
        private String backupDir;
        private boolean backupEnable;
        private UCrashCallback callback;
        private boolean customEnable;
        private boolean customUploadImmediately;
        private boolean javaCrashEnable;
        private boolean javaDumpAllThreads;
        private boolean logEnable;
        private boolean nativeCrashEnable;
        private boolean nativeDumpAllThreads;
        private String url;
        private boolean nativeCrashRethrow = true;
        private boolean javaCrashRethrow = true;
        private int customFileSaveLimit = 20;
        private int customFileUploadLimit = 20;

        public UCrashConfig build() {
            UCrashConfig uCrashConfig = new UCrashConfig();
            uCrashConfig.logEnable = this.logEnable;
            uCrashConfig.nativeCrashEnable = this.nativeCrashEnable;
            uCrashConfig.nativeCrashRethrow = this.nativeCrashRethrow;
            uCrashConfig.nativeDumpAllThreads = this.nativeDumpAllThreads;
            uCrashConfig.anrEnable = this.anrEnable;
            uCrashConfig.anrTraceHkEnable = this.anrTraceHkEnable;
            uCrashConfig.url = this.url;
            uCrashConfig.callback = this.callback;
            uCrashConfig.javaCrashEnable = this.javaCrashEnable;
            uCrashConfig.javaCrashRethrow = this.javaCrashRethrow;
            uCrashConfig.javaDumpAllThreads = this.javaDumpAllThreads;
            uCrashConfig.customEnable = this.customEnable;
            uCrashConfig.customUploadImmediately = this.customUploadImmediately;
            uCrashConfig.customFileSaveLimit = this.customFileSaveLimit;
            uCrashConfig.customFileUploadLimit = this.customFileUploadLimit;
            uCrashConfig.backupDir = this.backupDir;
            uCrashConfig.backupEnable = this.backupEnable;
            return uCrashConfig;
        }

        public Builder setAnrEnable(boolean z) {
            this.anrEnable = z;
            return this;
        }

        public Builder setAnrTraceHkEnable(boolean z) {
            this.anrTraceHkEnable = this.anrEnable;
            return this;
        }

        public Builder setBackupDir(String str) {
            this.backupDir = str;
            return this;
        }

        public Builder setBackupEnable(boolean z) {
            this.backupEnable = z;
            return this;
        }

        public Builder setCallback(UCrashCallback uCrashCallback) {
            this.callback = uCrashCallback;
            return this;
        }

        public Builder setCustomEnable(boolean z) {
            this.customEnable = z;
            return this;
        }

        public Builder setCustomFileSaveLimit(int i) {
            this.customFileSaveLimit = i;
            return this;
        }

        public Builder setCustomFileUploadLimit(int i) {
            this.customFileUploadLimit = i;
            return this;
        }

        public Builder setCustomUploadImmediately(boolean z) {
            this.customUploadImmediately = z;
            return this;
        }

        public Builder setJavaCrashEnable(boolean z) {
            this.javaCrashEnable = z;
            return this;
        }

        public Builder setJavaCrashRethrow(boolean z) {
            this.javaCrashRethrow = z;
            return this;
        }

        public Builder setJavaDumpAllThreads(boolean z) {
            this.javaDumpAllThreads = z;
            return this;
        }

        public Builder setLogEnable(boolean z) {
            this.logEnable = z;
            return this;
        }

        public Builder setNativeCrashEnable(boolean z) {
            this.nativeCrashEnable = z;
            return this;
        }

        public Builder setNativeCrashRethrow(boolean z) {
            this.nativeCrashRethrow = z;
            return this;
        }

        public Builder setNativeDumpAllThreads(boolean z) {
            this.nativeDumpAllThreads = z;
            return this;
        }

        public Builder setUrl(String str) {
            this.url = str;
            return this;
        }
    }
}
