package GUI;
import net.sf.json.JSONObject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class UserInterface extends JFrame {
    //选择栏
    private final JComboBox provinces;
    {
        provinces = new JComboBox(new String[]{"...","辽宁", "吉林", "黑龙江", "河北", "山西", "陕西", "甘肃", "青海", "山东",
                "安徽", "江苏", "浙江", "河南", "湖北", "湖南", "江西", "台湾", "福建", "云南", "海南", "四川", "贵州", "广东", "内蒙古", "新疆", "广西",
                "西藏", "宁夏", "北京", "上海", "天津", "重庆", "香港", "澳门"});
    }
    private String province_selected=(String)provinces.getSelectedItem();//省份当前状态

    private  JComboBox citys=new JComboBox(new String[]{"..."});
    private String target_city=(String)citys.getSelectedItem();//城市当前状况

    private static Map<String,String[]> model=new LinkedHashMap();
    static{
        model.put("...", new String[]{"..."});
        model.put("北京", new String[]{"北京"});
        model.put("上海", new String[]{"上海"});
        model.put("天津", new String[]{"天津"});
        model.put("重庆", new String[]{"重庆"});
        model.put("黑龙江", new String[]{"哈尔滨","齐齐哈尔","牡丹江","大庆","伊春","双鸭山","鹤岗","鸡西","佳木斯","七台河","黑河","绥化","大兴安岭"});
        model.put("吉林", new String[]{"长春","延边","吉林","白山","白城","四平","松原","辽源","大安","通化"});
        model.put("辽宁", new String[]{"沈阳","大连","葫芦岛","旅顺","本溪","抚顺","铁岭","辽阳","营口","阜新","朝阳","锦州","丹东","鞍山"});
        model.put("内蒙古", new String[]{"呼和浩特","呼伦贝尔","锡林浩特","包头","赤峰","海拉尔","乌海","鄂尔多斯","通辽"});
        model.put("河北", new String[]{"石家庄","唐山","张家口","廊坊","邢台","邯郸","沧州","衡水","承德","保定","秦皇岛"});
        model.put("河南", new String[]{"郑州","开封","洛阳","平顶山","焦作","鹤壁","新乡","安阳","濮阳","许昌","漯河","三门峡","南阳","商丘","信阳","周口","驻马店"});
        model.put("山东", new String[]{"济南","青岛","淄博","威海","曲阜","临沂","烟台","枣庄","聊城","济宁","菏泽","泰安","日照","东营","德州","滨州","莱芜","潍坊"});
        model.put("山西", new String[]{"太原","阳泉","晋城","晋中","临汾","运城","长治","朔州","忻州","大同","吕梁"});
        model.put("江苏", new String[]{"南京","苏州","昆山","南通","太仓","吴县","徐州","宜兴","镇江","淮安","常熟","盐城","泰州","无锡","连云港","扬州","常州","宿迁"});
        model.put("安徽", new String[]{"合肥","巢湖","蚌埠","安庆","六安","滁州","马鞍山","阜阳","宣城","铜陵","淮北","芜湖","毫州","宿州","淮南","池州"});
        model.put("陕西", new String[]{"西安","韩城","安康","汉中","宝鸡","咸阳","榆林","渭南","商洛","铜川","延安"});
        model.put("宁夏", new String[]{"银川","固原","中卫","石嘴山","吴忠"});
        model.put("甘肃", new String[]{"兰州","白银","庆阳","酒泉","天水","武威","张掖","甘南","临夏","平凉","定西","金昌"});
        model.put("青海", new String[]{"西宁","海北","海西","黄南","果洛","玉树","海东","海南"});
        model.put("湖北", new String[]{"武汉","宜昌","黄冈","恩施","荆州","神农架","十堰","咸宁","襄樊","孝感","随州","黄石","荆门","鄂州"});
        model.put("湖南", new String[]{"长沙","邵阳","常德","郴州","吉首","株洲","娄底","湘潭","益阳","永州","岳阳","衡阳","怀化","韶山","张家界"});
        model.put("浙江", new String[]{"杭州","湖州","金华","宁波","丽水","绍兴","雁荡山","衢州","嘉兴","台州","舟山","温州"});
        model.put("江西", new String[]{"南昌","萍乡","九江","上饶","抚州","吉安","鹰潭","宜春","新余","景德镇","赣州"});
        model.put("福建", new String[]{"福州","厦门","龙岩","南平","宁德","莆田","泉州","三明","漳州"});
        model.put("贵州", new String[]{"贵阳","安顺","赤水","遵义","铜仁","六盘水","毕节","凯里","都匀"});
        model.put("四川", new String[]{"成都","泸州","内江","凉山","阿坝","巴中","广元","乐山","绵阳","德阳","攀枝花","雅安","宜宾","自贡","甘孜州","达州","资阳","广安","遂宁","眉山","南充"});
        model.put("广东", new String[]{"广州","深圳","潮州","韶关","湛江","惠州","清远","东莞","江门","茂名","肇庆","汕尾","河源","揭阳","梅州","中山","德庆","阳江","云浮","珠海","汕头","佛山"});
        model.put("广西", new String[]{"南宁","桂林","阳朔","柳州","梧州","玉林","桂平","贺州","钦州","贵港","防城港","百色","北海","河池","来宾","崇左"});
        model.put("云南", new String[]{"昆明","保山","楚雄","德宏","红河","临沧","怒江","曲靖","思茅","文山","玉溪","昭通","丽江","大理"});
        model.put("海南", new String[]{"海口","三亚","儋州","琼山","通什","文昌"});
        model.put("新疆", new String[]{"乌鲁木齐","阿勒泰","阿克苏","昌吉","哈密","和田","喀什","克拉玛依","石河子","塔城","库尔勒","吐鲁番","伊宁"});
    }

    //底栏
    private JPanel jp = new JPanel();
    private JButton search = new JButton("SRARCH");
    //结果栏
    private JTextArea result =new JTextArea("要查天气吗？\n下拉框选取你想查的城市，马上就能告诉你结果！ ️\n\n" +
            "哦对了！记得帮我连上网络哦！");


    public void init() {

        jp.add(provinces);
        jp.add(citys);
        jp.add(search);

        result.setEditable(false);
        this.setSize(400, 300);
        this.setTitle("WEATHER!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(result, BorderLayout.CENTER);
        this.add(jp,BorderLayout.SOUTH);
        this.setVisible(true);


    }
    private void addEventHandler() {
        search.addActionListener(new SearchButtomClickedHandler());
        provinces.addItemListener(new ProvinceChanged());
        citys.addItemListener(new CityChanged());
    }

    private class SearchButtomClickedHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (target_city!="...") {
                JSONObject obj=JSONObject.fromObject(WeatherAPI.APIConnection.getConnection(target_city));

                if (obj.getString("resultcode").equals("200")) {
                    JSONObject res=(JSONObject) obj.get("result");
                    JSONObject sk=(JSONObject) res.get("sk");//获取实时数据JSONObject

                    result.setText("这是我为你查询到的"+target_city+"的实时天气状况：\n"+
                            "\n当前温度："+sk.getString("temp")+
                            "\n当前风向："+sk.getString("wind_direction")+
                            "\n当前风力："+sk.getString("wind_strength")+
                            "\n当前湿度："+sk.getString("humidity")+
                            "\n查询时间："+sk.getString("time"));

                    if(Integer.valueOf(sk.getString("temp"))<=10){
                        result.append("\n\n现在外面温度很低了，一定要多穿衣服，不要生病让朋友担心哦！");
                    }
                } else {result.setText("发生如下错误"+obj.getString("resultcode")+"\n请联系软件作者");
                }
            } else {
                result.setText("还没有选择要查询的城市呢，这要我怎么帮你查嘛！");
            }
        }
    }

    private class ProvinceChanged implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent e) {
            if(e.getStateChange() == ItemEvent.SELECTED) {
                citys.removeAllItems();
            province_selected=(String) provinces.getSelectedItem();
            citys.removeAllItems();
            for (String o:model.get(province_selected)
                 ) {
                citys.addItem(o);
                }
            }
        }
    }

    private class CityChanged implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent e) {
            if(e.getStateChange() == ItemEvent.SELECTED) {
                target_city = (String) citys.getSelectedItem();
            }
        }
    }

    public static void main(String arg[]){
        UserInterface UI= new UserInterface();
        UI.init();
        UI.addEventHandler();
    }
}
