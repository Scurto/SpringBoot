package com.scurto.shared;

import com.scurto.model.TaskModel;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by yustymenko on 17.11.2017.
 */
public class ChanelIdStorage {

    public static String getChanelId(String taskId) {
        HashMap<String, TaskModel> allTaskModel = getAllTaskModel();
        TaskModel taskModel = allTaskModel.get(taskId);
        return taskModel.getChannelId();
    }

    public static ArrayList<TaskModel> getAllTaskModelArray() {
        return new ArrayList<TaskModel>(getAllTaskModel().values());
    }

    public static HashMap<String, TaskModel> getAllTaskModel() {
        HashMap<String, TaskModel> allTaskModel = new HashMap<>();

        allTaskModel.put("0", model(
                "0",
                "8",
                "3",
                "2",
                10,
                10,
                "channel/UCJIbnmV8DdqOGEcl6hm-x8w",
                null,
                "test"
        ));

        allTaskModel.put("1", model(
                "1",
                "3",
                "3",
                "3",
                30,
                30,
                "channel/UCJIbnmV8DdqOGEcl6hm-x8w",
                null,
                "test"
        ));

        allTaskModel.put("2", model(
                "2",
                "3",
                "3",
                "3",
                30,
                30,
                "channel/UCJIbnmV8DdqOGEcl6hm-x8w",
                null,
                "test"
        ));
        allTaskModel.put("327158", model(
                "327158",
                "7",
                "2",
                "2",
                40,
                40,
                "user/dkdsl",
                null,
                "2271404 - Евгений"
        ));
        allTaskModel.put("58552", model(
                "58552",
                "2",
                "2",
                "3",
                40,
                40,
                "user/dkdsl",
                null,
                "810945 - Denys"
        ));
        allTaskModel.put("445089", model(
                "445089",
                "12",
                "0",
                "0",
                40,
                50,
                "user/dkdsl",
                null,
                "2271404 - Евгений"
        ));
        allTaskModel.put("513328", model(
                "513328",
                "8",
                "2",
                "3",
                40,
                40,
                "user/FitnessMontana",
                null,
                "2271404 - Евгений"
        ));
        allTaskModel.put("327835", model(
                "327835",
                "12",
                "1",
                "3",
                40,
                55,
                "user/PalkinBody",
                null,
                "2271404 - Евгений"
        ));
        allTaskModel.put("437355", model(
                "437355",
                "8",
                "2",
                "3",
                45,
                45,
                "user/PalkinChef",
                null,
                "2271404 - Евгений"
        ));
        allTaskModel.put("327160", model(
                "327160",
                "8",
                "2",
                "2",
                45,
                45,
                "user/PalkinBody",
                null,
                "2271404 - Евгений"
        ));
        allTaskModel.put("1457501", model(
                "1457501",
                "5",
                "3",
                "3",
                40,
                40,
                "channel/UCWviTklK43BjG7KP6sBQpbw",
                null,
                "8245711 - Дмитрий Мизерный"
        ));
//        allTaskModel.put("1628076", model(
//                "1628076",
//                "1",
//                "1",
//                "1",
//                34,
//                55,
//                "channel/UCufzTDx9I-75JgY5voVI7FA",
//                null,
//                    "6795138 - leyba5"
//        ));
        allTaskModel.put("1628076", model(
                "1628076",
                "5",
                "0",
                "0",
                34,
                40,
                "channel/UCufzTDx9I-75JgY5voVI7FA",
                null,
                "6795138 - leyba5"
        ));

        allTaskModel.put("1690816", model(
                "1690816",
                "1",
                "1",
                "2",
                35,
                50,
                "channel/UCufzTDx9I-75JgY5voVI7FA",
                null,
                "6795138 - leyba5"
        ));

        allTaskModel.put("1254825", model(
                "1254825",
                "3",
                "1",
                "2",
                30,
                30,
                "channel/UCE0fj9vk80sNG5ADEqrFF9g",
                null,
                "1403953 - Hugme"
        ));
        allTaskModel.put("1685040", model(
                "1685040",
                "1",
                "1",
                "2",
                40,
                50,
                "channel/UC8v0Rdi-gCEdFoprevXnrmg",
                null,
                "10919343 - Вадим"
        ));
        allTaskModel.put("1685742", model(
                "1685742",
                "1",
                "1",
                "2",
                40,
                50,
                "channel/UCiAFkRUtkYVs1vgXjHH7-ZQ",
                null,
                "10919343 - Вадим"
        ));
        allTaskModel.put("1667761", model(
                "1667761",
                "3",
                "1",
                "2",
                40,
                30,
                "channel/UCYVjyU0A7kA2wZOaMTlsIYQ",
                null
        ));
        allTaskModel.put("1687980", model(
                "1687980",
                "2",
                "2",
                "2",
                40,
                55,
                "channel/UCYZKH0xzLa_LYIYA76GgocA",
                null,
                "10806861 - Vu Nguyen"
        ));
        allTaskModel.put("1631021", model(
                "1631021",
                "4",
                "2",
                "3",
                50,
                40,
                "channel/UC8MYAUpyXcjIeAHfzy7ltIQ",
                null,
                "7276490 - giorgi"
        ));
        allTaskModel.put("2023447", model(
                "2023447",
                "1",
                "1",
                "2",
                50,
                40,
                "channel/UCSEvVPacsHMlKs8gUKTIbRA",
                null,
                "7276490 - giorgi"
        ));

        allTaskModel.put("1666434", model(
                "1666434",
                "5",
                "0",
                "0",
                40,
                40,
                "channel/UCyvDm5--fW3XaTjArYRzXEA",
                null,
                "7276490 - giorgi"
        ));
        allTaskModel.put("1693658", model(
                "1693658",
                "5",
                "0",
                "0",
                40,
                40,
                "channel/UCijtOtYJoUpyXBJuAuDlCLg",
                null,
                "7276490 - giorgi"
        ));
        allTaskModel.put("1513673", model(
                "1513673",
                "3",
                "2",
                "2",
                40,
                40,
                "channel/UCFK6TD22LyG21h7buxX4O3g",
                null,
                "7276490 - giorgi"
        ));
        allTaskModel.put("2093430", model(
                "2093430",
                "1",
                "1",
                "2",
                40,
                40,
                "channel/UCTEPTla6tSoW8SeSzv79Ybw",
                null,
                "7276490 - giorgi"
        ));
        allTaskModel.put("1641523", model(
                "1641523",
                "1",
                "1",
                "3",
                40,
                40,
                "user/NewMixPro",
                null,
                "10778148 - NewMix"
        ));

        allTaskModel.put("1597613", model(
                "1597613",
                "7",
                "2",
                "2",
                55,
                55,
                "channel/UC9h__DFkhKQ0D4JrYD_FmGA",
                null,
                "8622996 - Боря"
        ));

        allTaskModel.put("1686627", model(
                "1686627",
                "5",
                "5",
                "2",
                35,
                35,
                "channel/UCp4Ij2tD45ETgDqrQ723Lig",
                null
        ));

        allTaskModel.put("362698", model(
                "362698",
                "10",
                "0",
                "0",
                35,
                40,
                "user/Puteshestvie1",
                null,
                "2079971 - Mnatsakan"
        ));
        allTaskModel.put("677818", model(
                "677818",
                "8",
                "0",
                "0",
                35,
                40,
                "user/123pepush",
                null,
                "2079971 - Mnatsakan"
        ));

        allTaskModel.put("695075", model(
                "695075",
                "2",
                "2",
                "0",
                35,
                40,
                "user/123pepush",
                null,
                "2079971 - Mnatsakan"
        ));

        allTaskModel.put("1671590", model(
                "1671590",
                "10",
                "2",
                "2",
                35,
                45,
                "channel/UC3uEhRvVUFt3ypY1Us1aILg",
                null
        ));
        allTaskModel.put("1411090", model(
                "1411090",
                "2",
                "2",
                "0",
                35,
                35,
                "channel/UCTuHjQxohECtXF34vQY8GYA",
                null,
                "8386110 - Артём"
        ));
        allTaskModel.put("1306013", model(
                "1306013",
                "2",
                "2",
                "0",
                35,
                35,
                "channel/UCJZhOY2D3NodBzFVjiyMsiw",
                null,
                "8386110 - Артём"
        ));
        allTaskModel.put("1365817", model(
                "1365817",
                "3",
                "1",
                "1",
                35,
                35,
                "channel/UC9-uS0PokRtQJ9RL_jyuoRg",
                null,
                "8408010 - Александр"
        ));

        allTaskModel.put("1438352", model(
                "1438352",
                "3",
                "1",
                "2",
                40,
                40,
                "channel/UCJnyRfVt-mYajy9R8TMgMcQ",
                null,
                "9845746 - vladgrygorets"
        ));
        allTaskModel.put("1621843", model(
                "1621843",
                "2",
                "2",
                "2",
                40,
                40,
                "channel/UC0M2X8TxH7X6MKMiyVqFAWg",
                null,
                "9845746 - vladgrygorets"
        ));

        allTaskModel.put("1519863", model(
                "1519863",
                "5",
                "0",
                "0",
                59,
                59,
                "channel/UCMaG-XGGhdiqZX2j6jUAJbQ",
                null,
                "9368532 - Александр"
        ));

        allTaskModel.put("1679135", model(
                "1679135",
                "3",
                "2",
                "2",
                40,
                40,
                "channel/UC0vq6WjQ3dxWGxnFkF5SPwQ",
                null,
                "10724700 - Виктор"
        ));
        allTaskModel.put("357330", model(
                "357330",
                "2",
                "2",
                "0",
                40,
                40,
                "user/Puteshestvie1",
                null,
                "2079971 - Mnatsakan"
        ));
        allTaskModel.put("1764130", model(
                "1764130",
                "8",
                "2",
                "2",
                40,
                40,
                "channel/UCO0eop7jbAxaowFT-VoX4rA",
                null,
                "8338662 - Artem"
        ));
        allTaskModel.put("1764129", model(
                "1764129",
                "8",
                "2",
                "2",
                40,
                40,
                "channel/UCO0eop7jbAxaowFT-VoX4rA",
                null,
                "8338662 - Artem"
        ));
        allTaskModel.put("1823901", model(
                "1823901",
                "8",
                "2",
                "2",
                40,
                40,
                "channel/UCO0eop7jbAxaowFT-VoX4rA",
                null,
                "8338662 - Artem"
        ));
        allTaskModel.put("1778375", model(
                "1778375",
                "8",
                "2",
                "2",
                40,
                40,
                "channel/UCO0eop7jbAxaowFT-VoX4rA",
                null,
                "8338662 - Artem"
        ));
        allTaskModel.put("1772732", model(
                "1772732",
                "1",
                "1",
                "2",
                40,
                40,
                "channel/UCO0eop7jbAxaowFT-VoX4rA",
                null,
                "8338662 - Artem"
        ));
        allTaskModel.put("1781630", model(
                "1781630",
                "1",
                "1",
                "2",
                40,
                40,
                "channel/UCO0eop7jbAxaowFT-VoX4rA",
                null,
                "8338662 - Artem"
        ));
        allTaskModel.put("1772327", model(
                "1772327",
                "1",
                "1",
                "2",
                40,
                40,
                "channel/UCO0eop7jbAxaowFT-VoX4rA",
                null,
                "8338662 - Artem"
        ));
        allTaskModel.put("1779014", model(
                "1779014",
                "1",
                "1",
                "2",
                40,
                40,
                "channel/UCO0eop7jbAxaowFT-VoX4rA",
                null,
                "8338662 - Artem"
        ));
        allTaskModel.put("1781742", model(
                "1781742",
                "1",
                "1",
                "2",
                40,
                40,
                "channel/UCO0eop7jbAxaowFT-VoX4rA",
                null,
                "8338662 - Artem"
        ));
        allTaskModel.put("1772737", model(
                "1772737",
                "1",
                "1",
                "2",
                40,
                40,
                "channel/UCO0eop7jbAxaowFT-VoX4rA",
                null,
                "8338662 - Artem"
        ));
        allTaskModel.put("1779009", model(
                "1779009",
                "1",
                "1",
                "2",
                40,
                40,
                "channel/UCO0eop7jbAxaowFT-VoX4rA",
                null,
                "8338662 - Artem"
        ));
        allTaskModel.put("1776206", model(
                "1776206",
                "7",
                "2",
                "2",
                40,
                40,
                "channel/UCO0eop7jbAxaowFT-VoX4rA",
                null,
                "8338662 - Artem"
        ));
        allTaskModel.put("1772734", model(
                "1772734",
                "1",
                "1",
                "2",
                40,
                40,
                "channel/UCO0eop7jbAxaowFT-VoX4rA",
                null,
                "8338662 - Artem"
        ));
        allTaskModel.put("1772325", model(
                "1772325",
                "1",
                "1",
                "2",
                40,
                40,
                "channel/UCO0eop7jbAxaowFT-VoX4rA",
                null,
                "8338662 - Artem"
        ));
        allTaskModel.put("1689346", model(
                "1689346",
                "7",
                "2",
                "2",
                40,
                40,
                "channel/UCO0eop7jbAxaowFT-VoX4rA",
                null,
                "8338662 - Artem"
        ));
        allTaskModel.put("1762715", model(
                "1762715",
                "7",
                "2",
                "2",
                40,
                40,
                "channel/UCO0eop7jbAxaowFT-VoX4rA",
                null,
                "8338662 - Artem"
        ));
        allTaskModel.put("1710550", model(
                "1710550",
                "7",
                "2",
                "2",
                40,
                40,
                "channel/UCO0eop7jbAxaowFT-VoX4rA",
                null,
                "8338662 - Artem"
        ));
        allTaskModel.put("1743874", model(
                "1743874",
                "6",
                "2",
                "2",
                40,
                40,
                "channel/UCO0eop7jbAxaowFT-VoX4rA",
                null,
                "8338662 - Artem"
        ));
        allTaskModel.put("1752613", model(
                "1752613",
                "7",
                "2",
                "2",
                40,
                40,
                "channel/UCO0eop7jbAxaowFT-VoX4rA",
                null,
                "8338662 - Artem"
        ));
        allTaskModel.put("1715132", model(
                "1715132",
                "8",
                "3",
                "2",
                40,
                40,
                "channel/UCO0eop7jbAxaowFT-VoX4rA",
                null,
                "8338662 - Artem"
        ));
        allTaskModel.put("1714618", model(
                "1714618",
                "7",
                "2",
                "2",
                40,
                40,
                "channel/UCO0eop7jbAxaowFT-VoX4rA",
                null,
                "8338662 - Artem"
        ));
        allTaskModel.put("1003172", model(
                "1003172",
                "1",
                "1",
                "2",
                40,
                40,
                "channel/UCVVmtpAp4IY5125T0rPnPzQ",
                null,
                "4319928 - константин"
        ));

        allTaskModel.put("1690574", model(
                "1690574",
                "3",
                "0",
                "0",
                40,
                40,
                "channel/UCXJDkX877UWROZm600EbC-Q",
                null,
                "10593886 - Дмитрий"
        ));
        allTaskModel.put("1638945", model(
                "1638945",
                "2",
                "1",
                "0",
                40,
                40,
                "channel/UC0uMjs5jDTxNWPtpDYVqSfg",
                null,
                "8628827 - Алексей"
        ));
        allTaskModel.put("1512009", model(
                "1512009",
                "1",
                "1",
                "3",
                55,
                55,
                "channel/UCowi5AtUatUgwYZcN7QAULw",
                null,
                "5901117 - евгений"
        ));
        allTaskModel.put("1657703", model(
                "1657703",
                "7",
                "2",
                "2",
                45,
                45,
                "channel/UCxRpk1y2ombMG_0v1GSHaRw",
                null,
                "7655705 - ИнСтрейтик"
        ));

        allTaskModel.put("458591", model(
                "458591",
                "3",
                "3",
                "4",
                40,
                40,
                "channel/UCLKUuorEvs2B9sHkO1TKYfA",
                null,
                "mane4ka666"
        ));

        allTaskModel.put("1677336", model(
                "1677336",
                "11",
                "3",
                "2",
                40,
                40,
                "user/MultiGamewave",
                null,
                "7607850 - Андрей"
        ));
        allTaskModel.put("461054", model(
                "461054",
                "5",
                "0",
                "0",
                40,
                40,
                "channel/UCBpSWqTc4qgKy4BWn7o6jcQ",
                null,
                "leyba5"
        ));

        allTaskModel.put("451370", model(
                "451370",
                "4",
                "1",
                "3",
                40,
                40,
                "user/vivas87100",
                null,
                "vivas87"
        ));
        allTaskModel.put("1396892", model(
                "1396892",
                "7",
                "1",
                "2",
                40,
                40,
                "channel/UCMPf1__FICpCId_eEgcFh2Q",
                null,
                "6595001 - Александр"
        ));
        allTaskModel.put("1608647", model(
                "1608647",
                "2",
                "2",
                "3",
                40,
                40,
                "channel/UCm1VsOSi1Ra3JzLeFmzvqWQ",
                null,
                "10652628 - Данила"
        ));
        allTaskModel.put("783047", model(
                "783047",
                "1",
                "1",
                "3",
                40,
                40,
                "channel/UCP06q5TsCnLIPx0qvlSdLrg",
                null,
                "2367430 - Владислав"
        ));

        allTaskModel.put("1793798", model(
                "1793798",
                "1",
                "1",
                "2",
                40,
                40,
                "channel/UCGLuQftVvy1Dh8rey0cOPZg", /*8,488,621 views*/
                null,
                "8338662 - Artem"
        ));

        allTaskModel.put("1592901", model(
                "1592901",
                "3",
                "0",
                "0",
                40,
                59,
                "channel/UCBmPC4lPIRU6-ockY_a0iyA",
                null,
                "10479925 - Владимир"
        ));

        allTaskModel.put("1920464", model(
                "1920464",
                "3",
                "0",
                "0",
                40,
                59,
                "channel/UCSG6Hyf22sndqn_8Y7UdS7g",
                null,
                "10479925 - Владимир"
        ));

        allTaskModel.put("1998179", model(
                "1998179",
                "3",
                "2",
                "2",
                40,
                59,
                "channel/UC20GEQ2-0ew0a4pwvYDtajA",
                null,
                "3595603 - Виталий"
        ));

        allTaskModel.put("1798360", model(
                "1798360",
                "1",
                "1",
                "3",
                50,
                50,
                "channel/UCSf9GXVyAMtaH5C0MUk4dBA",
                null,
                "1843108 - Александр"
        ));

        allTaskModel.put("1850118", model(
                "1850118",
                "8",
                "1",
                "3",
                50,
                50,
                "user/vietpro107",
                null,
                "11452479 - Viet"
        ));

        allTaskModel.put("1957261", model(
                "1957261",
                "8",
                "0",
                "3",
                50,
                50,
                "channel/UCE_TxpYG15ywWxtbIVgMMfw",
                null,
                "11908963 - Роман"
        ));

        allTaskModel.put("2233384", model(
                "2233384",
                "3",
                "3",
                "0",
                50,
                50,
                "channel/UCtjVt2gg2a9ux9VpaqsgU1Q",
                null,
                "12737640 - Денис"
        ));

        allTaskModel.put("616441", model(
                "616441",
                "3",
                "3",
                "0",
                50,
                50,
                "channel/UCtjVt2gg2a9ux9VpaqsgU1Q",
                null,
                "12737640 - Денис"
        ));

        allTaskModel.put("2149241", model(
                "2149241",
                "3",
                "3",
                "0",
                50,
                50,
                "channel/UCZ4HpE01pjMM7_NGRxxuf7A",
                null,
                "12737640 - Денис"
        ));

        allTaskModel.put("616336", model(
                "616336",
                "3",
                "3",
                "0",
                50,
                50,
                "channel/UCZ4HpE01pjMM7_NGRxxuf7A",
                null,
                "12737640 - Денис"
        ));

        allTaskModel.put("2259286", model(
                "2259286",
                "3",
                "3",
                "0",
                50,
                50,
                "channel/UCy2Wks9wESs0l2Ew1X0XZ0g",
                null,
                "12737640 - Денис"
        ));

        allTaskModel.put("2249261", model(
                "2249261",
                "3",
                "3",
                "0",
                55,
                55,
                "channel/UCOIZ4CUeVLeDl021PYt7WXQ",
                null,
                "12737640 - Денис"
        ));

        allTaskModel.put("2176038", model(
                "2176038",
                "3",
                "3",
                "0",
                50,
                50,
                "channel/UCmqEbKWYrFnTChKukC8FMZA",
                null,
                "11812117 - Карина"
        ));

        allTaskModel.put("2199357", model(
                "2199357",
                "3",
                "3",
                "0",
                50,
                50,
                "channel/UCTpFR4Y5T9ElJEHWyPyuUNg",
                null,
                "11812117 - Карина"
        ));

        allTaskModel.put("1934042", model(
                "1934042",
                "3",
                "3",
                "0",
                50,
                50,
                "channel/UC3CQBZjU-AN6VXL4Itr5uWg",
                null,
                "11812117 - Карина"
        ));

        allTaskModel.put("2129007", model(
                "2129007",
                "3",
                "3",
                "0",
                50,
                50,
                "channel/UC2VHtWFgU-5e3N49idxdrMA",
                null,
                "11812117 - Карина"
        ));

        allTaskModel.put("616370", model(
                "616370",
                "3",
                "3",
                "0",
                50,
                50,
                "channel/UC2VHtWFgU-5e3N49idxdrMA",
                null,
                "11812117 - Карина"
        ));

        allTaskModel.put("2217057", model(
                "2217057",
                "3",
                "3",
                "0",
                50,
                50,
                "channel/UCgLo8DDOY1XuRc7D_xBTzUw",
                null,
                "12719205 - саша"
        ));

        allTaskModel.put("616127", model(
                "616127",
                "3",
                "3",
                "0",
                50,
                50,
                "channel/UCgLo8DDOY1XuRc7D_xBTzUw",
                null,
                "12719205 - саша"
        ));

        allTaskModel.put("2250190", model(
                "2250190",
                "3",
                "3",
                "0",
                50,
                50,
                "channel/UCz0t73tAZlrp3cYE75LYiOg",
                null,
                "12719205 - саша"
        ));

        allTaskModel.put("2225777", model(
                "2225777",
                "3",
                "3",
                "0",
                50,
                50,
                "channel/UC22bS-BnDDxPYUrXZF3pUdA",
                null,
                "12719205 - саша"
        ));

        allTaskModel.put("2176188", model(
                "2176188",
                "3",
                "3",
                "0",
                50,
                50,
                "channel/UC1nWfCAdU6C33SH3lW4v00w",
                null,
                "12719205 - саша"
        ));

        allTaskModel.put("2255976", model(
                "2255976",
                "3",
                "3",
                "0",
                50,
                50,
                "channel/UCsSjOWKxB-T9vpt7mUNw-fw",
                null,
                "12694129 - Лерон"
        ));

        allTaskModel.put("1989404", model(
                "1989404",
                "3",
                "2",
                "2",
                50,
                50,
                "channel/UC_QMwN0isisxRfa82MnfLLA",
                null,
                "11862838 - Вячеслав"
        ));

        allTaskModel.put("1386051", model(
                "1386051",
                "3",
                "9",
                "0",
                50,
                50,
                "channel/UCT0vk_JVN0supBjGpoKOjdg",
                null,
                "8340468 - Игорь"
        ));

        allTaskModel.put("2226186", model(
                "2226186",
                "3",
                "1",
                "2",
                50,
                50,
                "channel/UCG1J1K_xpyflQx3kb1l2vCQ",
                null,
                "13016913 - Vlad"
        ));

        allTaskModel.put("2253038", model(
                "2253038",
                "3",
                "2",
                "3",
                50,
                50,
                "user/MultiGamewave",
                null,
                "7607850 - Андрей"
        ));

        allTaskModel.put("2260642", model(
                "2260642",
                "3",
                "3",
                "0",
                55,
                55,
                "channel/UCjhkTq63x7RjScGLDiFua9Q",
                null,
                "13064231 - Валентин"
        ));

        allTaskModel.put("2277962", model(
                "2277962",
                "3",
                "3",
                "0",
                55,
                55,
                "channel/UC4nVhD6KyNVJAOaAtrR3V2g",
                null,
                "13129229 - юрий"
        ));

        allTaskModel.put("2272904", model(
                "2272904",
                "3",
                "3",
                "0",
                55,
                55,
                "channel/UCFL9LdfZWBhG_USrU7LdPgg",
                null,
                "13129229 - юрий"
        ));

        allTaskModel.put("2271474", model(
                "2271474",
                "3",
                "3",
                "2",
                55,
                55,
                "channel/UC3U3k23RgQetlMTRfeq52_A",
                null,
                "13158309 - James"
        ));


        return allTaskModel;
    }

    private static TaskModel model(String taskId, String countVideo, String countReklama, String countMove, Integer reklamaFreeze, Integer videoFreeze, String channelId, String strategy) {
        return model(taskId, countVideo, countReklama, countMove, reklamaFreeze, videoFreeze,channelId, strategy, null);
    }

    private static TaskModel model(String taskId, String countVideo, String countReklama, String countMove, Integer reklamaFreeze, Integer videoFreeze, String channelId, String strategy, String taskOwner) {
        TaskModel taskModel = new TaskModel();
        taskModel.setTaskId(taskId);
        taskModel.setCountVideo(countVideo);
        taskModel.setCountReklama(countReklama);
        taskModel.setCountMove(countMove);
        taskModel.setReklamaFreeze(reklamaFreeze);
        taskModel.setVideoFreeze(videoFreeze);
        taskModel.setChannelId(channelId);
        if (strategy != null) {
            taskModel.setStrategy(strategy);
        } else {
            taskModel.setStrategy("classic");
        }

        taskModel.setTaskOwner(taskOwner);
        return taskModel;
    }
}
