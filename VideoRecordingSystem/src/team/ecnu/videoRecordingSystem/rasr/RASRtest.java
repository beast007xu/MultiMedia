package team.ecnu.videoRecordingSystem.rasr;
public class RASRtest {
    public static void main(String[] args) {
        //用户需修改为自己的secretid，secret_key,appid
        String secret_key = "paGmCOUQ3XrFSenOolcL6mohYMg5Vlqs";
        String secretid = "AKIDcItXCvxBdtPMEzwu9KUp3PhuGpT2Ngol";
        String appid = "1258350067";

        //识别引擎 8k_0 or 16k_0
        String engine_model_type = "8k_0";

        //结果返回方式 0：同步返回 or 1：尾包返回
        String res_type = "0";

        // 识别结果文本编码方式 0:UTF-8,1:GB2312,2:GBK,3:BIG5
        String result_text_format = "0";

        // 语音编码方式 1:wav 4:sp 6:skill
        String voice_format = "1";

        String filepath = "output.wav";

        // 语音切片长度 cutlength<200000
        int cutlength = 6400;
        //调用setConfig函数设置相关参数
        int res = RASRsdk.setConfig(secret_key, secretid, appid, engine_model_type, res_type, result_text_format, voice_format, filepath, cutlength);
        if (res < 0) {
            return;
        }
        //调用sendVoice函数获得音频识别结果
        RASRsdk.sendVoice();
    }
}
