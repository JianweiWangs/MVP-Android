package com.tulong.wf.architectureofmvp.entity;

import java.util.List;

/**
 * Created by wangjianwei on 2017/2/28.
 */

public class DemoModel {

    /**
     * date : 20170228
     * stories : [{"images":["http://pic3.zhimg.com/04b1e2bdaff37058eea45ca38b04d6f6.jpg"],"type":0,"id":9255787,"ga_prefix":"022815","title":"我们离电影《终结者》中的人形机器人还有多远？"},{"images":["http://pic3.zhimg.com/f5eff1f35620087dd414e80c7637560a.jpg"],"type":0,"id":9255432,"ga_prefix":"022814","title":"浓妆和淡妆哪个更好，这是科学家们的研究"},{"images":["http://pic2.zhimg.com/552cfcbdf5b22d1838778c272a542cb5.jpg"],"type":0,"id":9244950,"ga_prefix":"022813","title":"人人都应该知道的妇科常识有哪些？"},{"images":["http://pic1.zhimg.com/7030eb90d16264414932205d2aa48e08.jpg"],"type":0,"id":9255165,"ga_prefix":"022812","title":"大误 · 二月二是个好日子"},{"title":"建立预期，选好搭配，对牛油果「路转粉」之后就停不下来","ga_prefix":"022811","images":["http://pic4.zhimg.com/33e42614637e81a5746d7d84bf9dfc87.jpg"],"multipic":true,"type":0,"id":9254457},{"images":["http://pic2.zhimg.com/d8f36004628c4d1a3b6d1e2be7e81591.jpg"],"type":0,"id":9251246,"ga_prefix":"022810","title":"真正的吃货，一口就尝出冷鲜奶和常温奶的区别"},{"title":"我在洛杉矶找到了《爱乐之城》里关于爱的 15 个地点","ga_prefix":"022809","images":["http://pic3.zhimg.com/b0df0cc5e98fbac6ff7fd821b4057426.jpg"],"multipic":true,"type":0,"id":9254337},{"images":["http://pic3.zhimg.com/a66e7586025c20eadda9350a5ced1d2a.jpg"],"type":0,"id":9253808,"ga_prefix":"022808","title":"作为一名眼科医生，我想说「洗眼液」真的没什么用"},{"images":["http://pic3.zhimg.com/2a9a83a7a5a2c69d887c63cccb2a2a16.jpg"],"type":0,"id":9253270,"ga_prefix":"022807","title":"偏远的奥特莱斯，难用的录像机，都是为了赚钱专门设计的"},{"images":["http://pic2.zhimg.com/d3642908f3881056cd969eae16d025fd.jpg"],"type":0,"id":9254324,"ga_prefix":"022807","title":"奥斯卡 · 本届影帝有个很红的哥哥，还有更多的爱和更清醒的「任性」"},{"images":["http://pic2.zhimg.com/2bc3ef8df694da1ba2a29674b7d40d25.jpg"],"type":0,"id":9253384,"ga_prefix":"022807","title":"巨头出手，共享单车领域的决定性战役即将开启？"},{"images":["http://pic2.zhimg.com/6f924666559fd601d02a219b4eace4d9.jpg"],"type":0,"id":9244327,"ga_prefix":"022806","title":"瞎扯 · 如何正确地吐槽"}]
     * top_stories : [{"image":"http://pic4.zhimg.com/9bfee2171e89af64018322a91697f76b.jpg","type":0,"id":9255787,"ga_prefix":"022815","title":"我们离电影《终结者》中的人形机器人还有多远？"},{"image":"http://pic1.zhimg.com/47e863a15f47d6631b502231dd96b658.jpg","type":0,"id":9254337,"ga_prefix":"022809","title":"我在洛杉矶找到了《爱乐之城》里关于爱的 15 个地点"},{"image":"http://pic2.zhimg.com/dec813de80659e17554c9a8d311fb419.jpg","type":0,"id":9253270,"ga_prefix":"022807","title":"偏远的奥特莱斯，难用的录像机，都是为了赚钱专门设计的"},{"image":"http://pic4.zhimg.com/695a89274adcfaad94758568f5afdd5b.jpg","type":0,"id":9253384,"ga_prefix":"022807","title":"巨头出手，共享单车领域的决定性战役即将开启？"},{"image":"http://pic3.zhimg.com/6184ccf05c5bd52053f21f150fef32d6.jpg","type":0,"id":9253411,"ga_prefix":"022716","title":"奥斯卡 · 这是一份完整的（没出错的）获奖名单分析"}]
     */

    private String date;
    private List<StoriesBean> stories;
    private List<TopStoriesBean> top_stories;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<StoriesBean> getStories() {
        return stories;
    }

    public void setStories(List<StoriesBean> stories) {
        this.stories = stories;
    }

    public List<TopStoriesBean> getTop_stories() {
        return top_stories;
    }

    public void setTop_stories(List<TopStoriesBean> top_stories) {
        this.top_stories = top_stories;
    }

    public static class StoriesBean {
        /**
         * images : ["http://pic3.zhimg.com/04b1e2bdaff37058eea45ca38b04d6f6.jpg"]
         * type : 0
         * id : 9255787
         * ga_prefix : 022815
         * title : 我们离电影《终结者》中的人形机器人还有多远？
         * multipic : true
         */

        private int type;
        private int id;
        private String ga_prefix;
        private String title;
        private boolean multipic;
        private List<String> images;

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public boolean isMultipic() {
            return multipic;
        }

        public void setMultipic(boolean multipic) {
            this.multipic = multipic;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }

    public static class TopStoriesBean {
        /**
         * image : http://pic4.zhimg.com/9bfee2171e89af64018322a91697f76b.jpg
         * type : 0
         * id : 9255787
         * ga_prefix : 022815
         * title : 我们离电影《终结者》中的人形机器人还有多远？
         */

        private String image;
        private int type;
        private int id;
        private String ga_prefix;
        private String title;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
