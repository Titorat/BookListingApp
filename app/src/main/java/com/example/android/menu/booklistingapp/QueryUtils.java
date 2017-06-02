package com.example.android.menu.booklistingapp;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by tito rat on 6/2/2017.
 */



public class QueryUtils {

    public static final String sampleJsonResponse = "{\n" +
            " \"kind\": \"books#volumes\",\n" +
            " \"totalItems\": 103,\n" +
            " \"items\": [\n" +
            "  {\n" +
            "   \"kind\": \"books#volume\",\n" +
            "   \"id\": \"uMA7fgEgKDUC\",\n" +
            "   \"etag\": \"nNOCjkjK2N0\",\n" +
            "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/uMA7fgEgKDUC\",\n" +
            "   \"volumeInfo\": {\n" +
            "    \"title\": \"Lord of the Ring\",\n" +
            "    \"subtitle\": \"In Search of Count von Zinzendorf\",\n" +
            "    \"authors\": [\n" +
            "     \"Phil Anderson\"\n" +
            "    ],\n" +
            "    \"publisher\": \"Gospel Light Publications\",\n" +
            "    \"publishedDate\": \"2007-04-05\",\n" +
            "    \"description\": \"Part history, part narrative, The Lord of the Ring takes readers on a fascinating journey back to the 18th century Moravian renewal movement and 100-year prayer watch. Experience the passion of young Count Nikolaus Ludwig von Zinzendorf and his friends as they took a vow to serve Christ their King faithfully in whatever situation of life they found themselves. Signed by the five school friends and illustrated in a medallion made by Zinzendorf’s grandmother, the vow of the “Confessors of Christ” is as relevant today as when it first was conceived in 1716. Join Phil Anderson on an aerial road trip via his three-seater plane as he undertakes a 21st century pilgrimage from England to Germany. Anderson retraces the steps of Zinzendorf, reconnects with his legacy and seeks to apply it to life and faith in a new millennium. Learning from the past, readers will discover crucial signposts for grappling with the Church of today’s identity and calling as an authentic, relational, missional community.\",\n" +
            "    \"industryIdentifiers\": [\n" +
            "     {\n" +
            "      \"type\": \"ISBN_10\",\n" +
            "      \"identifier\": \"0830743278\"\n" +
            "     },\n" +
            "     {\n" +
            "      \"type\": \"ISBN_13\",\n" +
            "      \"identifier\": \"9780830743278\"\n" +
            "     }\n" +
            "    ],\n" +
            "    \"readingModes\": {\n" +
            "     \"text\": true,\n" +
            "     \"image\": true\n" +
            "    },\n" +
            "    \"pageCount\": 192,\n" +
            "    \"printType\": \"BOOK\",\n" +
            "    \"categories\": [\n" +
            "     \"Religion\"\n" +
            "    ],\n" +
            "    \"averageRating\": 5.0,\n" +
            "    \"ratingsCount\": 2,\n" +
            "    \"maturityRating\": \"NOT_MATURE\",\n" +
            "    \"allowAnonLogging\": false,\n" +
            "    \"contentVersion\": \"0.0.3.0.preview.3\",\n" +
            "    \"imageLinks\": {\n" +
            "     \"smallThumbnail\": \"http://books.google.com/books/content?id=uMA7fgEgKDUC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
            "     \"thumbnail\": \"http://books.google.com/books/content?id=uMA7fgEgKDUC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
            "    },\n" +
            "    \"language\": \"en\",\n" +
            "    \"previewLink\": \"http://books.google.com.eg/books?id=uMA7fgEgKDUC&printsec=frontcover&dq=lordofthering&hl=&cd=1&source=gbs_api\",\n" +
            "    \"infoLink\": \"http://books.google.com.eg/books?id=uMA7fgEgKDUC&dq=lordofthering&hl=&source=gbs_api\",\n" +
            "    \"canonicalVolumeLink\": \"https://books.google.com/books/about/Lord_of_the_Ring.html?hl=&id=uMA7fgEgKDUC\"\n" +
            "   },\n" +
            "   \"saleInfo\": {\n" +
            "    \"country\": \"EG\",\n" +
            "    \"saleability\": \"NOT_FOR_SALE\",\n" +
            "    \"isEbook\": false\n" +
            "   },\n" +
            "   \"accessInfo\": {\n" +
            "    \"country\": \"EG\",\n" +
            "    \"viewability\": \"PARTIAL\",\n" +
            "    \"embeddable\": true,\n" +
            "    \"publicDomain\": false,\n" +
            "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
            "    \"epub\": {\n" +
            "     \"isAvailable\": true\n" +
            "    },\n" +
            "    \"pdf\": {\n" +
            "     \"isAvailable\": true\n" +
            "    },\n" +
            "    \"webReaderLink\": \"http://play.google.com/books/reader?id=uMA7fgEgKDUC&hl=&printsec=frontcover&source=gbs_api\",\n" +
            "    \"accessViewStatus\": \"SAMPLE\",\n" +
            "    \"quoteSharingAllowed\": false\n" +
            "   },\n" +
            "   \"searchInfo\": {\n" +
            "    \"textSnippet\": \"Part history, part narrative, The Lord of the Ring takes readers on a fascinating journey back to the 18th century Moravian renewal movement and 100-year prayer watch.\"\n" +
            "   }\n" +
            "  },\n" +
            "  {\n" +
            "   \"kind\": \"books#volume\",\n" +
            "   \"id\": \"uyN3PvQZ2JEC\",\n" +
            "   \"etag\": \"Sk+f/qmOi8s\",\n" +
            "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/uyN3PvQZ2JEC\",\n" +
            "   \"volumeInfo\": {\n" +
            "    \"title\": \"Who is the Lord of the Ring?\",\n" +
            "    \"authors\": [\n" +
            "     \"Ray Comfort\"\n" +
            "    ],\n" +
            "    \"publisher\": \"Bridge-Logos\",\n" +
            "    \"publishedDate\": \"2002-06-01\",\n" +
            "    \"industryIdentifiers\": [\n" +
            "     {\n" +
            "      \"type\": \"ISBN_10\",\n" +
            "      \"identifier\": \"0882708929\"\n" +
            "     },\n" +
            "     {\n" +
            "      \"type\": \"ISBN_13\",\n" +
            "      \"identifier\": \"9780882708928\"\n" +
            "     }\n" +
            "    ],\n" +
            "    \"readingModes\": {\n" +
            "     \"text\": false,\n" +
            "     \"image\": false\n" +
            "    },\n" +
            "    \"pageCount\": 126,\n" +
            "    \"printType\": \"BOOK\",\n" +
            "    \"categories\": [\n" +
            "     \"Bible\"\n" +
            "    ],\n" +
            "    \"maturityRating\": \"NOT_MATURE\",\n" +
            "    \"allowAnonLogging\": false,\n" +
            "    \"contentVersion\": \"preview-1.0.0\",\n" +
            "    \"imageLinks\": {\n" +
            "     \"smallThumbnail\": \"http://books.google.com/books/content?id=uyN3PvQZ2JEC&printsec=frontcover&img=1&zoom=5&source=gbs_api\",\n" +
            "     \"thumbnail\": \"http://books.google.com/books/content?id=uyN3PvQZ2JEC&printsec=frontcover&img=1&zoom=1&source=gbs_api\"\n" +
            "    },\n" +
            "    \"language\": \"es\",\n" +
            "    \"previewLink\": \"http://books.google.com.eg/books?id=uyN3PvQZ2JEC&q=lordofthering&dq=lordofthering&hl=&cd=2&source=gbs_api\",\n" +
            "    \"infoLink\": \"http://books.google.com.eg/books?id=uyN3PvQZ2JEC&dq=lordofthering&hl=&source=gbs_api\",\n" +
            "    \"canonicalVolumeLink\": \"https://books.google.com/books/about/Who_is_the_Lord_of_the_Ring.html?hl=&id=uyN3PvQZ2JEC\"\n" +
            "   },\n" +
            "   \"saleInfo\": {\n" +
            "    \"country\": \"EG\",\n" +
            "    \"saleability\": \"NOT_FOR_SALE\",\n" +
            "    \"isEbook\": false\n" +
            "   },\n" +
            "   \"accessInfo\": {\n" +
            "    \"country\": \"EG\",\n" +
            "    \"viewability\": \"NO_PAGES\",\n" +
            "    \"embeddable\": false,\n" +
            "    \"publicDomain\": false,\n" +
            "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
            "    \"epub\": {\n" +
            "     \"isAvailable\": false\n" +
            "    },\n" +
            "    \"pdf\": {\n" +
            "     \"isAvailable\": false\n" +
            "    },\n" +
            "    \"webReaderLink\": \"http://play.google.com/books/reader?id=uyN3PvQZ2JEC&hl=&printsec=frontcover&source=gbs_api\",\n" +
            "    \"accessViewStatus\": \"NONE\",\n" +
            "    \"quoteSharingAllowed\": false\n" +
            "   }\n" +
            "  },\n" +
            "  {\n" +
            "   \"kind\": \"books#volume\",\n" +
            "   \"id\": \"5knlsgEACAAJ\",\n" +
            "   \"etag\": \"PxMdxU5vy/Q\",\n" +
            "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/5knlsgEACAAJ\",\n" +
            "   \"volumeInfo\": {\n" +
            "    \"title\": \"The Two Towers\",\n" +
            "    \"subtitle\": \"J.R.R. Tolkien - The Lord of the Ring - Book 2\",\n" +
            "    \"authors\": [\n" +
            "     \"Editorial Editorial World\",\n" +
            "     \"J. R. R. Tolkien\"\n" +
            "    ],\n" +
            "    \"publisher\": \"CreateSpace\",\n" +
            "    \"publishedDate\": \"2015-06-09\",\n" +
            "    \"description\": \"THE GREATEST FANTASY EPIC OF OUR TIME The Fellowship is scattered. Some are bracing hopelessly for war against the ancient evil of Sauron. Some are contending with the treachery of the wizard Saruman. Only Frodo and Sam are left to take the accursed One Ring, ruler of all the Rings of Power, to be destroyed in Mordor, the dark realm where Sauron is supreme. Their guide is Gollum, deceitful and lust-filled, slave to the corruption of the Ring.\",\n" +
            "    \"industryIdentifiers\": [\n" +
            "     {\n" +
            "      \"type\": \"ISBN_10\",\n" +
            "      \"identifier\": \"1514297272\"\n" +
            "     },\n" +
            "     {\n" +
            "      \"type\": \"ISBN_13\",\n" +
            "      \"identifier\": \"9781514297278\"\n" +
            "     }\n" +
            "    ],\n" +
            "    \"readingModes\": {\n" +
            "     \"text\": false,\n" +
            "     \"image\": false\n" +
            "    },\n" +
            "    \"pageCount\": 168,\n" +
            "    \"printType\": \"BOOK\",\n" +
            "    \"maturityRating\": \"NOT_MATURE\",\n" +
            "    \"allowAnonLogging\": false,\n" +
            "    \"contentVersion\": \"preview-1.0.0\",\n" +
            "    \"imageLinks\": {\n" +
            "     \"smallThumbnail\": \"http://books.google.com/books/content?id=5knlsgEACAAJ&printsec=frontcover&img=1&zoom=5&source=gbs_api\",\n" +
            "     \"thumbnail\": \"http://books.google.com/books/content?id=5knlsgEACAAJ&printsec=frontcover&img=1&zoom=1&source=gbs_api\"\n" +
            "    },\n" +
            "    \"language\": \"en\",\n" +
            "    \"previewLink\": \"http://books.google.com.eg/books?id=5knlsgEACAAJ&dq=lordofthering&hl=&cd=3&source=gbs_api\",\n" +
            "    \"infoLink\": \"http://books.google.com.eg/books?id=5knlsgEACAAJ&dq=lordofthering&hl=&source=gbs_api\",\n" +
            "    \"canonicalVolumeLink\": \"https://books.google.com/books/about/The_Two_Towers.html?hl=&id=5knlsgEACAAJ\"\n" +
            "   },\n" +
            "   \"saleInfo\": {\n" +
            "    \"country\": \"EG\",\n" +
            "    \"saleability\": \"NOT_FOR_SALE\",\n" +
            "    \"isEbook\": false\n" +
            "   },\n" +
            "   \"accessInfo\": {\n" +
            "    \"country\": \"EG\",\n" +
            "    \"viewability\": \"NO_PAGES\",\n" +
            "    \"embeddable\": false,\n" +
            "    \"publicDomain\": false,\n" +
            "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
            "    \"epub\": {\n" +
            "     \"isAvailable\": false\n" +
            "    },\n" +
            "    \"pdf\": {\n" +
            "     \"isAvailable\": false\n" +
            "    },\n" +
            "    \"webReaderLink\": \"http://play.google.com/books/reader?id=5knlsgEACAAJ&hl=&printsec=frontcover&source=gbs_api\",\n" +
            "    \"accessViewStatus\": \"NONE\",\n" +
            "    \"quoteSharingAllowed\": false\n" +
            "   },\n" +
            "   \"searchInfo\": {\n" +
            "    \"textSnippet\": \"THE GREATEST FANTASY EPIC OF OUR TIME The Fellowship is scattered.\"\n" +
            "   }\n" +
            "  },\n" +
            "  {\n" +
            "   \"kind\": \"books#volume\",\n" +
            "   \"id\": \"9YvqpeVa-_QC\",\n" +
            "   \"etag\": \"pMFZrLcPRiE\",\n" +
            "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/9YvqpeVa-_QC\",\n" +
            "   \"volumeInfo\": {\n" +
            "    \"title\": \"The Lord of the Rings\",\n" +
            "    \"authors\": [\n" +
            "     \"J. R. R. Tolkien\"\n" +
            "    ],\n" +
            "    \"publisher\": \"Spark Notes\",\n" +
            "    \"publishedDate\": \"2002\",\n" +
            "    \"description\": \"For over fifty years, J.R.R. Tolkien's peerless fantasy has accumulated worldwide acclaim as the greatest adventure tale ever written. No other writer has created a world as distinct as Middle-earth, complete with its own geography, history, languages, and legends. And no one has created characters as endearing as Tolkien's large-hearted, hairy-footed hobbits. Tolkien's The Lord of the Rings continues to seize the imaginations of readers of all ages, and this new three-volume paperback edition is designed to appeal to the youngest of them.\",\n" +
            "    \"industryIdentifiers\": [\n" +
            "     {\n" +
            "      \"type\": \"ISBN_10\",\n" +
            "      \"identifier\": \"1586637908\"\n" +
            "     },\n" +
            "     {\n" +
            "      \"type\": \"ISBN_13\",\n" +
            "      \"identifier\": \"9781586637903\"\n" +
            "     }\n" +
            "    ],\n" +
            "    \"readingModes\": {\n" +
            "     \"text\": false,\n" +
            "     \"image\": false\n" +
            "    },\n" +
            "    \"pageCount\": 260,\n" +
            "    \"printType\": \"BOOK\",\n" +
            "    \"categories\": [\n" +
            "     \"Study Aids\"\n" +
            "    ],\n" +
            "    \"averageRating\": 3.0,\n" +
            "    \"ratingsCount\": 1,\n" +
            "    \"maturityRating\": \"NOT_MATURE\",\n" +
            "    \"allowAnonLogging\": false,\n" +
            "    \"contentVersion\": \"1.1.1.0.preview.0\",\n" +
            "    \"imageLinks\": {\n" +
            "     \"smallThumbnail\": \"http://books.google.com/books/content?id=9YvqpeVa-_QC&printsec=frontcover&img=1&zoom=5&source=gbs_api\",\n" +
            "     \"thumbnail\": \"http://books.google.com/books/content?id=9YvqpeVa-_QC&printsec=frontcover&img=1&zoom=1&source=gbs_api\"\n" +
            "    },\n" +
            "    \"language\": \"en\",\n" +
            "    \"previewLink\": \"http://books.google.com.eg/books?id=9YvqpeVa-_QC&q=lordofthering&dq=lordofthering&hl=&cd=4&source=gbs_api\",\n" +
            "    \"infoLink\": \"http://books.google.com.eg/books?id=9YvqpeVa-_QC&dq=lordofthering&hl=&source=gbs_api\",\n" +
            "    \"canonicalVolumeLink\": \"https://books.google.com/books/about/The_Lord_of_the_Rings.html?hl=&id=9YvqpeVa-_QC\"\n" +
            "   },\n" +
            "   \"saleInfo\": {\n" +
            "    \"country\": \"EG\",\n" +
            "    \"saleability\": \"NOT_FOR_SALE\",\n" +
            "    \"isEbook\": false\n" +
            "   },\n" +
            "   \"accessInfo\": {\n" +
            "    \"country\": \"EG\",\n" +
            "    \"viewability\": \"NO_PAGES\",\n" +
            "    \"embeddable\": false,\n" +
            "    \"publicDomain\": false,\n" +
            "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
            "    \"epub\": {\n" +
            "     \"isAvailable\": false\n" +
            "    },\n" +
            "    \"pdf\": {\n" +
            "     \"isAvailable\": false\n" +
            "    },\n" +
            "    \"webReaderLink\": \"http://play.google.com/books/reader?id=9YvqpeVa-_QC&hl=&printsec=frontcover&source=gbs_api\",\n" +
            "    \"accessViewStatus\": \"NONE\",\n" +
            "    \"quoteSharingAllowed\": false\n" +
            "   },\n" +
            "   \"searchInfo\": {\n" +
            "    \"textSnippet\": \"Vietnamese version of Tolkien&#39;s Lord of the Ring: Fellowship of the Ring, book 1 of the series.\"\n" +
            "   }\n" +
            "  },\n" +
            "  {\n" +
            "   \"kind\": \"books#volume\",\n" +
            "   \"id\": \"r9L7JJlV2cQC\",\n" +
            "   \"etag\": \"Hh9meMplEFg\",\n" +
            "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/r9L7JJlV2cQC\",\n" +
            "   \"volumeInfo\": {\n" +
            "    \"title\": \"Machine Learning and Data Mining in Pattern Recognition\",\n" +
            "    \"subtitle\": \"Third International Conference, MLDM 2003, Leipzig, Germany, July 5-7, 2003, proceedings\",\n" +
            "    \"authors\": [\n" +
            "     \"Petra Perner\",\n" +
            "     \"Azriel Rosenfeld\"\n" +
            "    ],\n" +
            "    \"publisher\": \"Springer Science & Business Media\",\n" +
            "    \"publishedDate\": \"2003-06-25\",\n" +
            "    \"description\": \"TheInternationalConferenceonMachineLearningandDataMining(MLDM)is the third meeting in a series of biennial events, which started in 1999, organized by the Institute of Computer Vision and Applied Computer Sciences (IBaI) in Leipzig. MLDM began as a workshop and is now a conference, and has brought the topic of machine learning and data mining to the attention of the research community. Seventy-?ve papers were submitted to the conference this year. The program committeeworkedhardtoselectthemostprogressiveresearchinafairandc- petent review process which led to the acceptance of 33 papers for presentation at the conference. The 33 papers in these proceedings cover a wide variety of topics related to machine learning and data mining. The two invited talks deal with learning in case-based reasoning and with mining for structural data. The contributed papers can be grouped into nine areas: support vector machines; pattern dis- very; decision trees; clustering; classi?cation and retrieval; case-based reasoning; Bayesian models and methods; association rules; and applications. We would like to express our appreciation to the reviewers for their precise andhighlyprofessionalwork.WearegratefultotheGermanScienceFoundation for its support of the Eastern European researchers. We appreciate the help and understanding of the editorial sta? at Springer Verlag, and in particular Alfred Hofmann,whosupportedthepublicationoftheseproceedingsintheLNAIseries. Last, but not least, we wish to thank all the speakers and participants who contributed to the success of the conference.\",\n" +
            "    \"industryIdentifiers\": [\n" +
            "     {\n" +
            "      \"type\": \"ISBN_13\",\n" +
            "      \"identifier\": \"9783540405047\"\n" +
            "     },\n" +
            "     {\n" +
            "      \"type\": \"ISBN_10\",\n" +
            "      \"identifier\": \"3540405046\"\n" +
            "     }\n" +
            "    ],\n" +
            "    \"readingModes\": {\n" +
            "     \"text\": false,\n" +
            "     \"image\": true\n" +
            "    },\n" +
            "    \"pageCount\": 444,\n" +
            "    \"printType\": \"BOOK\",\n" +
            "    \"categories\": [\n" +
            "     \"Computers\"\n" +
            "    ],\n" +
            "    \"maturityRating\": \"NOT_MATURE\",\n" +
            "    \"allowAnonLogging\": false,\n" +
            "    \"contentVersion\": \"preview-1.0.0\",\n" +
            "    \"imageLinks\": {\n" +
            "     \"smallThumbnail\": \"http://books.google.com/books/content?id=r9L7JJlV2cQC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
            "     \"thumbnail\": \"http://books.google.com/books/content?id=r9L7JJlV2cQC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
            "    },\n" +
            "    \"language\": \"en\",\n" +
            "    \"previewLink\": \"http://books.google.com.eg/books?id=r9L7JJlV2cQC&pg=PA369&dq=lordofthering&hl=&cd=5&source=gbs_api\",\n" +
            "    \"infoLink\": \"http://books.google.com.eg/books?id=r9L7JJlV2cQC&dq=lordofthering&hl=&source=gbs_api\",\n" +
            "    \"canonicalVolumeLink\": \"https://books.google.com/books/about/Machine_Learning_and_Data_Mining_in_Patt.html?hl=&id=r9L7JJlV2cQC\"\n" +
            "   },\n" +
            "   \"saleInfo\": {\n" +
            "    \"country\": \"EG\",\n" +
            "    \"saleability\": \"NOT_FOR_SALE\",\n" +
            "    \"isEbook\": false\n" +
            "   },\n" +
            "   \"accessInfo\": {\n" +
            "    \"country\": \"EG\",\n" +
            "    \"viewability\": \"PARTIAL\",\n" +
            "    \"embeddable\": true,\n" +
            "    \"publicDomain\": false,\n" +
            "    \"textToSpeechPermission\": \"ALLOWED_FOR_ACCESSIBILITY\",\n" +
            "    \"epub\": {\n" +
            "     \"isAvailable\": false\n" +
            "    },\n" +
            "    \"pdf\": {\n" +
            "     \"isAvailable\": true,\n" +
            "     \"acsTokenLink\": \"http://books.google.com.eg/books/download/Machine_Learning_and_Data_Mining_in_Patt-sample-pdf.acsm?id=r9L7JJlV2cQC&format=pdf&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
            "    },\n" +
            "    \"webReaderLink\": \"http://play.google.com/books/reader?id=r9L7JJlV2cQC&hl=&printsec=frontcover&source=gbs_api\",\n" +
            "    \"accessViewStatus\": \"SAMPLE\",\n" +
            "    \"quoteSharingAllowed\": false\n" +
            "   },\n" +
            "   \"searchInfo\": {\n" +
            "    \"textSnippet\": \"An example of such an association rule in data mining could be 80% of the movie \\u003cbr\\u003e\\ngoers for “The \\u003cb\\u003eLord of the Ring\\u003c/b\\u003e” went on to buy the book, and such a population \\u003cbr\\u003e\\naccounts for 20% of the entire sample population. Support and confidence are&nbsp;...\"\n" +
            "   }\n" +
            "  },\n" +
            "  {\n" +
            "   \"kind\": \"books#volume\",\n" +
            "   \"id\": \"1sFpBQAAQBAJ\",\n" +
            "   \"etag\": \"8H2RkdqX1qo\",\n" +
            "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/1sFpBQAAQBAJ\",\n" +
            "   \"volumeInfo\": {\n" +
            "    \"title\": \"The 3CW Encyclopedia\",\n" +
            "    \"authors\": [\n" +
            "     \"James Dixon\"\n" +
            "    ],\n" +
            "    \"publisher\": \"Lulu.com\",\n" +
            "    \"industryIdentifiers\": [\n" +
            "     {\n" +
            "      \"type\": \"ISBN_13\",\n" +
            "      \"identifier\": \"9781291394658\"\n" +
            "     },\n" +
            "     {\n" +
            "      \"type\": \"ISBN_10\",\n" +
            "      \"identifier\": \"1291394656\"\n" +
            "     }\n" +
            "    ],\n" +
            "    \"readingModes\": {\n" +
            "     \"text\": false,\n" +
            "     \"image\": true\n" +
            "    },\n" +
            "    \"printType\": \"BOOK\",\n" +
            "    \"maturityRating\": \"NOT_MATURE\",\n" +
            "    \"allowAnonLogging\": false,\n" +
            "    \"contentVersion\": \"preview-1.0.0\",\n" +
            "    \"imageLinks\": {\n" +
            "     \"smallThumbnail\": \"http://books.google.com/books/content?id=1sFpBQAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
            "     \"thumbnail\": \"http://books.google.com/books/content?id=1sFpBQAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
            "    },\n" +
            "    \"language\": \"en\",\n" +
            "    \"previewLink\": \"http://books.google.com.eg/books?id=1sFpBQAAQBAJ&pg=PA153&dq=lordofthering&hl=&cd=6&source=gbs_api\",\n" +
            "    \"infoLink\": \"http://books.google.com.eg/books?id=1sFpBQAAQBAJ&dq=lordofthering&hl=&source=gbs_api\",\n" +
            "    \"canonicalVolumeLink\": \"https://books.google.com/books/about/The_3CW_Encyclopedia.html?hl=&id=1sFpBQAAQBAJ\"\n" +
            "   },\n" +
            "   \"saleInfo\": {\n" +
            "    \"country\": \"EG\",\n" +
            "    \"saleability\": \"NOT_FOR_SALE\",\n" +
            "    \"isEbook\": false\n" +
            "   },\n" +
            "   \"accessInfo\": {\n" +
            "    \"country\": \"EG\",\n" +
            "    \"viewability\": \"PARTIAL\",\n" +
            "    \"embeddable\": true,\n" +
            "    \"publicDomain\": false,\n" +
            "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
            "    \"epub\": {\n" +
            "     \"isAvailable\": false\n" +
            "    },\n" +
            "    \"pdf\": {\n" +
            "     \"isAvailable\": false\n" +
            "    },\n" +
            "    \"webReaderLink\": \"http://play.google.com/books/reader?id=1sFpBQAAQBAJ&hl=&printsec=frontcover&source=gbs_api\",\n" +
            "    \"accessViewStatus\": \"SAMPLE\",\n" +
            "    \"quoteSharingAllowed\": false\n" +
            "   },\n" +
            "   \"searchInfo\": {\n" +
            "    \"textSnippet\": \"That brings out Whitton&#39;s opponent for the evening in the \\u003cb\\u003eLord of the Ring\\u003c/b\\u003e \\u003cbr\\u003e\\ntournament, 3CW champion, Ice XVII. He suggests that Colt get a shot at the \\u003cbr\\u003e\\ntournament and make the match a 3-way dance. Whitton is less than thrilled, but \\u003cbr\\u003e\\nCabana&nbsp;...\"\n" +
            "   }\n" +
            "  },\n" +
            "  {\n" +
            "   \"kind\": \"books#volume\",\n" +
            "   \"id\": \"aWZzLPhY4o0C\",\n" +
            "   \"etag\": \"7oG90NA2Zw8\",\n" +
            "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/aWZzLPhY4o0C\",\n" +
            "   \"volumeInfo\": {\n" +
            "    \"title\": \"The Fellowship of the Ring\",\n" +
            "    \"subtitle\": \"Being the First Part of The Lord of the Rings\",\n" +
            "    \"authors\": [\n" +
            "     \"J.R.R. Tolkien\"\n" +
            "    ],\n" +
            "    \"publisher\": \"Houghton Mifflin Harcourt\",\n" +
            "    \"publishedDate\": \"2012-02-15\",\n" +
            "    \"description\": \"The first volume in J.R.R. Tolkien's epic adventure THE LORD OF THE RINGS One Ring to rule them all, One Ring to find them, One Ring to bring them all and in the darkness bind them In ancient times the Rings of Power were crafted by the Elven-smiths, and Sauron, the Dark Lord, forged the One Ring, filling it with his own power so that he could rule all others. But the One Ring was taken from him, and though he sought it throughout Middle-earth, it remained lost to him. After many ages it fell into the hands of Bilbo Baggins, as told in The Hobbit. In a sleepy village in the Shire, young Frodo Baggins finds himself faced with an immense task, as his elderly cousin Bilbo entrusts the Ring to his care. Frodo must leave his home and make a perilous journey across Middle-earth to the Cracks of Doom, there to destroy the Ring and foil the Dark Lord in his evil purpose. “A unique, wholly realized other world, evoked from deep in the well of Time, massively detailed, absorbingly entertaining, profound in meaning.” – New York Times\",\n" +
            "    \"industryIdentifiers\": [\n" +
            "     {\n" +
            "      \"type\": \"ISBN_13\",\n" +
            "      \"identifier\": \"9780547952017\"\n" +
            "     },\n" +
            "     {\n" +
            "      \"type\": \"ISBN_10\",\n" +
            "      \"identifier\": \"0547952015\"\n" +
            "     }\n" +
            "    ],\n" +
            "    \"readingModes\": {\n" +
            "     \"text\": true,\n" +
            "     \"image\": true\n" +
            "    },\n" +
            "    \"pageCount\": 432,\n" +
            "    \"printType\": \"BOOK\",\n" +
            "    \"categories\": [\n" +
            "     \"Fiction\"\n" +
            "    ],\n" +
            "    \"averageRating\": 4.5,\n" +
            "    \"ratingsCount\": 75,\n" +
            "    \"maturityRating\": \"NOT_MATURE\",\n" +
            "    \"allowAnonLogging\": true,\n" +
            "    \"contentVersion\": \"3.16.14.0.preview.3\",\n" +
            "    \"panelizationSummary\": {\n" +
            "     \"containsEpubBubbles\": false,\n" +
            "     \"containsImageBubbles\": false\n" +
            "    },\n" +
            "    \"imageLinks\": {\n" +
            "     \"smallThumbnail\": \"http://books.google.com/books/content?id=aWZzLPhY4o0C&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
            "     \"thumbnail\": \"http://books.google.com/books/content?id=aWZzLPhY4o0C&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
            "    },\n" +
            "    \"language\": \"en\",\n" +
            "    \"previewLink\": \"http://books.google.com.eg/books?id=aWZzLPhY4o0C&pg=PT164&dq=lordofthering&hl=&cd=7&source=gbs_api\",\n" +
            "    \"infoLink\": \"http://books.google.com.eg/books?id=aWZzLPhY4o0C&dq=lordofthering&hl=&source=gbs_api\",\n" +
            "    \"canonicalVolumeLink\": \"https://books.google.com/books/about/The_Fellowship_of_the_Ring.html?hl=&id=aWZzLPhY4o0C\"\n" +
            "   },\n" +
            "   \"saleInfo\": {\n" +
            "    \"country\": \"EG\",\n" +
            "    \"saleability\": \"NOT_FOR_SALE\",\n" +
            "    \"isEbook\": false\n" +
            "   },\n" +
            "   \"accessInfo\": {\n" +
            "    \"country\": \"EG\",\n" +
            "    \"viewability\": \"PARTIAL\",\n" +
            "    \"embeddable\": true,\n" +
            "    \"publicDomain\": false,\n" +
            "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
            "    \"epub\": {\n" +
            "     \"isAvailable\": true,\n" +
            "     \"acsTokenLink\": \"http://books.google.com.eg/books/download/The_Fellowship_of_the_Ring-sample-epub.acsm?id=aWZzLPhY4o0C&format=epub&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
            "    },\n" +
            "    \"pdf\": {\n" +
            "     \"isAvailable\": true,\n" +
            "     \"acsTokenLink\": \"http://books.google.com.eg/books/download/The_Fellowship_of_the_Ring-sample-pdf.acsm?id=aWZzLPhY4o0C&format=pdf&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
            "    },\n" +
            "    \"webReaderLink\": \"http://play.google.com/books/reader?id=aWZzLPhY4o0C&hl=&printsec=frontcover&source=gbs_api\",\n" +
            "    \"accessViewStatus\": \"SAMPLE\",\n" +
            "    \"quoteSharingAllowed\": false\n" +
            "   },\n" +
            "   \"searchInfo\": {\n" +
            "    \"textSnippet\": \"cried Pippin, springing up. &#39;Here is our noble cousin! Make way for Frodo, \\u003cb\\u003eLord of\\u003c/b\\u003e \\u003cbr\\u003e\\n\\u003cb\\u003ethe Ring\\u003c/b\\u003e!&#39; &#39;Hush!&#39; said Gandalf from the shadows at the back of the porch. &#39;Evil \\u003cbr\\u003e\\nthings do not come into this valley; but all the same we should not name them.\"\n" +
            "   }\n" +
            "  },\n" +
            "  {\n" +
            "   \"kind\": \"books#volume\",\n" +
            "   \"id\": \"wRP4dbYE0bAC\",\n" +
            "   \"etag\": \"ua3NI2KwCaQ\",\n" +
            "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/wRP4dbYE0bAC\",\n" +
            "   \"volumeInfo\": {\n" +
            "    \"title\": \"LORD OF THE RINGS - FELLOWSHIP OF THE RING\",\n" +
            "    \"subtitle\": \"INSIDERS' GUIDE\",\n" +
            "    \"authors\": [\n" +
            "     \"Brian Sibley\"\n" +
            "    ],\n" +
            "    \"publishedDate\": \"2001-11\",\n" +
            "    \"description\": \"This highly-illustrated Movie Guide features black and white photos on every spread, together with 16 pages of stunning colour photos. It is packed with interviews with the cast and crew, background to the film, features on special effects, monsters and make-up and also, how Peter Jackson's vision became a reality! - Brian Sibley spent weeks in New Zealand with the film team gathering material for this fun and insightful book.\",\n" +
            "    \"industryIdentifiers\": [\n" +
            "     {\n" +
            "      \"type\": \"ISBN_10\",\n" +
            "      \"identifier\": \"0007131941\"\n" +
            "     },\n" +
            "     {\n" +
            "      \"type\": \"ISBN_13\",\n" +
            "      \"identifier\": \"9780007131945\"\n" +
            "     }\n" +
            "    ],\n" +
            "    \"readingModes\": {\n" +
            "     \"text\": false,\n" +
            "     \"image\": false\n" +
            "    },\n" +
            "    \"pageCount\": 95,\n" +
            "    \"printType\": \"BOOK\",\n" +
            "    \"categories\": [\n" +
            "     \"Juvenile Nonfiction\"\n" +
            "    ],\n" +
            "    \"maturityRating\": \"NOT_MATURE\",\n" +
            "    \"allowAnonLogging\": false,\n" +
            "    \"contentVersion\": \"0.0.1.0.preview.0\",\n" +
            "    \"imageLinks\": {\n" +
            "     \"smallThumbnail\": \"http://books.google.com/books/content?id=wRP4dbYE0bAC&printsec=frontcover&img=1&zoom=5&source=gbs_api\",\n" +
            "     \"thumbnail\": \"http://books.google.com/books/content?id=wRP4dbYE0bAC&printsec=frontcover&img=1&zoom=1&source=gbs_api\"\n" +
            "    },\n" +
            "    \"language\": \"en\",\n" +
            "    \"previewLink\": \"http://books.google.com.eg/books?id=wRP4dbYE0bAC&q=lordofthering&dq=lordofthering&hl=&cd=8&source=gbs_api\",\n" +
            "    \"infoLink\": \"http://books.google.com.eg/books?id=wRP4dbYE0bAC&dq=lordofthering&hl=&source=gbs_api\",\n" +
            "    \"canonicalVolumeLink\": \"https://books.google.com/books/about/LORD_OF_THE_RINGS_FELLOWSHIP_OF_THE_RING.html?hl=&id=wRP4dbYE0bAC\"\n" +
            "   },\n" +
            "   \"saleInfo\": {\n" +
            "    \"country\": \"EG\",\n" +
            "    \"saleability\": \"NOT_FOR_SALE\",\n" +
            "    \"isEbook\": false\n" +
            "   },\n" +
            "   \"accessInfo\": {\n" +
            "    \"country\": \"EG\",\n" +
            "    \"viewability\": \"NO_PAGES\",\n" +
            "    \"embeddable\": false,\n" +
            "    \"publicDomain\": false,\n" +
            "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
            "    \"epub\": {\n" +
            "     \"isAvailable\": false\n" +
            "    },\n" +
            "    \"pdf\": {\n" +
            "     \"isAvailable\": false\n" +
            "    },\n" +
            "    \"webReaderLink\": \"http://play.google.com/books/reader?id=wRP4dbYE0bAC&hl=&printsec=frontcover&source=gbs_api\",\n" +
            "    \"accessViewStatus\": \"NONE\",\n" +
            "    \"quoteSharingAllowed\": false\n" +
            "   },\n" +
            "   \"searchInfo\": {\n" +
            "    \"textSnippet\": \"- Brian Sibley spent weeks in New Zealand with the film team gathering material for this fun and insightful book.\"\n" +
            "   }\n" +
            "  },\n" +
            "  {\n" +
            "   \"kind\": \"books#volume\",\n" +
            "   \"id\": \"veM5AQAAMAAJ\",\n" +
            "   \"etag\": \"9xlZgqXAoNw\",\n" +
            "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/veM5AQAAMAAJ\",\n" +
            "   \"volumeInfo\": {\n" +
            "    \"title\": \"The Spectator\",\n" +
            "    \"subtitle\": \"Corrected from the Originals, with a Preface, Historical and Biographical by A. Chalmers\",\n" +
            "    \"publishedDate\": \"1817\",\n" +
            "    \"industryIdentifiers\": [\n" +
            "     {\n" +
            "      \"type\": \"OTHER\",\n" +
            "      \"identifier\": \"NYPL:33433107899894\"\n" +
            "     }\n" +
            "    ],\n" +
            "    \"readingModes\": {\n" +
            "     \"text\": false,\n" +
            "     \"image\": true\n" +
            "    },\n" +
            "    \"printType\": \"BOOK\",\n" +
            "    \"categories\": [\n" +
            "     \"English essays\"\n" +
            "    ],\n" +
            "    \"maturityRating\": \"NOT_MATURE\",\n" +
            "    \"allowAnonLogging\": false,\n" +
            "    \"contentVersion\": \"0.1.1.0.full.1\",\n" +
            "    \"panelizationSummary\": {\n" +
            "     \"containsEpubBubbles\": false,\n" +
            "     \"containsImageBubbles\": false\n" +
            "    },\n" +
            "    \"imageLinks\": {\n" +
            "     \"smallThumbnail\": \"http://books.google.com/books/content?id=veM5AQAAMAAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
            "     \"thumbnail\": \"http://books.google.com/books/content?id=veM5AQAAMAAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
            "    },\n" +
            "    \"language\": \"en\",\n" +
            "    \"previewLink\": \"http://books.google.com.eg/books?id=veM5AQAAMAAJ&pg=PA138&dq=lordofthering&hl=&cd=9&source=gbs_api\",\n" +
            "    \"infoLink\": \"https://play.google.com/store/books/details?id=veM5AQAAMAAJ&source=gbs_api\",\n" +
            "    \"canonicalVolumeLink\": \"https://market.android.com/details?id=book-veM5AQAAMAAJ\"\n" +
            "   },\n" +
            "   \"saleInfo\": {\n" +
            "    \"country\": \"EG\",\n" +
            "    \"saleability\": \"FREE\",\n" +
            "    \"isEbook\": true,\n" +
            "    \"buyLink\": \"https://play.google.com/store/books/details?id=veM5AQAAMAAJ&rdid=book-veM5AQAAMAAJ&rdot=1&source=gbs_api\"\n" +
            "   },\n" +
            "   \"accessInfo\": {\n" +
            "    \"country\": \"EG\",\n" +
            "    \"viewability\": \"ALL_PAGES\",\n" +
            "    \"embeddable\": true,\n" +
            "    \"publicDomain\": true,\n" +
            "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
            "    \"epub\": {\n" +
            "     \"isAvailable\": false\n" +
            "    },\n" +
            "    \"pdf\": {\n" +
            "     \"isAvailable\": true,\n" +
            "     \"downloadLink\": \"http://books.google.com.eg/books/download/The_Spectator.pdf?id=veM5AQAAMAAJ&hl=&output=pdf&sig=ACfU3U0Le8LUTo7VE_FY5mN4nNXqhgVQJg&source=gbs_api\"\n" +
            "    },\n" +
            "    \"webReaderLink\": \"http://play.google.com/books/reader?id=veM5AQAAMAAJ&hl=&printsec=frontcover&source=gbs_api\",\n" +
            "    \"accessViewStatus\": \"FULL_PUBLIC_DOMAIN\",\n" +
            "    \"quoteSharingAllowed\": false\n" +
            "   },\n" +
            "   \"searchInfo\": {\n" +
            "    \"textSnippet\": \"... ancestors had won so many hats, that his parlour looked like a haberdasher&#39;s \\u003cbr\\u003e\\nshop.” However, this thirst of glory in them all was the reason * As You like it. Act \\u003cbr\\u003e\\nL80. 6. Shakspt {that no one man stood “ \\u003cb\\u003elord of the ring\\u003c/b\\u003e” &#39;138 sPncrArom no 16!\"\n" +
            "   }\n" +
            "  },\n" +
            "  {\n" +
            "   \"kind\": \"books#volume\",\n" +
            "   \"id\": \"LRlHAAAAQBAJ\",\n" +
            "   \"etag\": \"hEmVoBxSbTA\",\n" +
            "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/LRlHAAAAQBAJ\",\n" +
            "   \"volumeInfo\": {\n" +
            "    \"title\": \"The Cinema of Michael Mann\",\n" +
            "    \"subtitle\": \"Vice and Vindication\",\n" +
            "    \"authors\": [\n" +
            "     \"Jonathan Rayner\"\n" +
            "    ],\n" +
            "    \"publisher\": \"Columbia University Press\",\n" +
            "    \"publishedDate\": \"2013-09-22\",\n" +
            "    \"description\": \"Michael Mann is one of the most important American filmmakers of the past forty years. His films exhibit the existential concerns of art cinema, articulated through a conspicuous and recognizable visual style and yet integrated within classical Hollywood narrative and genre frameworks. Since his beginnings as a screenwriter in the 1970s, Mann has become a key figure within contemporary American popular culture as writer, director, and producer for film and television. This volume offers a detailed study of Mann's feature films, from The Jericho Mile (1979) to Public Enemies (2009), with consideration also being given to parallels in the production, style, and characterization in his television work. It explores Mann's relationship with classical genres, his thematic concentration on issues of morality and masculinity, his film adaptations from literature, and the development and significance of his trademark visual style within modern American cinema.\",\n" +
            "    \"industryIdentifiers\": [\n" +
            "     {\n" +
            "      \"type\": \"ISBN_13\",\n" +
            "      \"identifier\": \"9780231850490\"\n" +
            "     },\n" +
            "     {\n" +
            "      \"type\": \"ISBN_10\",\n" +
            "      \"identifier\": \"0231850492\"\n" +
            "     }\n" +
            "    ],\n" +
            "    \"readingModes\": {\n" +
            "     \"text\": true,\n" +
            "     \"image\": true\n" +
            "    },\n" +
            "    \"pageCount\": 240,\n" +
            "    \"printType\": \"BOOK\",\n" +
            "    \"categories\": [\n" +
            "     \"Performing Arts\"\n" +
            "    ],\n" +
            "    \"maturityRating\": \"NOT_MATURE\",\n" +
            "    \"allowAnonLogging\": false,\n" +
            "    \"contentVersion\": \"2.4.4.0.preview.3\",\n" +
            "    \"panelizationSummary\": {\n" +
            "     \"containsEpubBubbles\": false,\n" +
            "     \"containsImageBubbles\": false\n" +
            "    },\n" +
            "    \"imageLinks\": {\n" +
            "     \"smallThumbnail\": \"http://books.google.com/books/content?id=LRlHAAAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
            "     \"thumbnail\": \"http://books.google.com/books/content?id=LRlHAAAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
            "    },\n" +
            "    \"language\": \"en\",\n" +
            "    \"previewLink\": \"http://books.google.com.eg/books?id=LRlHAAAAQBAJ&pg=PA176&dq=lordofthering&hl=&cd=10&source=gbs_api\",\n" +
            "    \"infoLink\": \"https://play.google.com/store/books/details?id=LRlHAAAAQBAJ&source=gbs_api\",\n" +
            "    \"canonicalVolumeLink\": \"https://market.android.com/details?id=book-LRlHAAAAQBAJ\"\n" +
            "   },\n" +
            "   \"saleInfo\": {\n" +
            "    \"country\": \"EG\",\n" +
            "    \"saleability\": \"FOR_SALE\",\n" +
            "    \"isEbook\": true,\n" +
            "    \"listPrice\": {\n" +
            "     \"amount\": 178.68,\n" +
            "     \"currencyCode\": \"EGP\"\n" +
            "    },\n" +
            "    \"retailPrice\": {\n" +
            "     \"amount\": 178.68,\n" +
            "     \"currencyCode\": \"EGP\"\n" +
            "    },\n" +
            "    \"buyLink\": \"https://play.google.com/store/books/details?id=LRlHAAAAQBAJ&rdid=book-LRlHAAAAQBAJ&rdot=1&source=gbs_api\",\n" +
            "    \"offers\": [\n" +
            "     {\n" +
            "      \"finskyOfferType\": 1,\n" +
            "      \"listPrice\": {\n" +
            "       \"amountInMicros\": 1.7868E8,\n" +
            "       \"currencyCode\": \"EGP\"\n" +
            "      },\n" +
            "      \"retailPrice\": {\n" +
            "       \"amountInMicros\": 1.7868E8,\n" +
            "       \"currencyCode\": \"EGP\"\n" +
            "      }\n" +
            "     }\n" +
            "    ]\n" +
            "   },\n" +
            "   \"accessInfo\": {\n" +
            "    \"country\": \"EG\",\n" +
            "    \"viewability\": \"PARTIAL\",\n" +
            "    \"embeddable\": true,\n" +
            "    \"publicDomain\": false,\n" +
            "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
            "    \"epub\": {\n" +
            "     \"isAvailable\": true,\n" +
            "     \"acsTokenLink\": \"http://books.google.com.eg/books/download/The_Cinema_of_Michael_Mann-sample-epub.acsm?id=LRlHAAAAQBAJ&format=epub&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
            "    },\n" +
            "    \"pdf\": {\n" +
            "     \"isAvailable\": true,\n" +
            "     \"acsTokenLink\": \"http://books.google.com.eg/books/download/The_Cinema_of_Michael_Mann-sample-pdf.acsm?id=LRlHAAAAQBAJ&format=pdf&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
            "    },\n" +
            "    \"webReaderLink\": \"http://play.google.com/books/reader?id=LRlHAAAAQBAJ&hl=&printsec=frontcover&source=gbs_api\",\n" +
            "    \"accessViewStatus\": \"SAMPLE\",\n" +
            "    \"quoteSharingAllowed\": false\n" +
            "   },\n" +
            "   \"searchInfo\": {\n" +
            "    \"textSnippet\": \"Anon. (1996) &#39;Bob and Al in the Coffee Shop: Michael Mann&#39;s Notes for the \\u003cbr\\u003e\\nCoffee Shop Scene&#39;, Sight and Sound, 6, 3, 14–19. Arthur, Paul (2002) &#39;\\u003cb\\u003eLord of\\u003c/b\\u003e \\u003cbr\\u003e\\n\\u003cb\\u003ethe Ring\\u003c/b\\u003e&#39;, Film Comment, 38, 1, 32–4. Austin, Guy (1996) Contemporary French&nbsp;...\"\n" +
            "   }\n" +
            "  }\n" +
            " ]\n" +
            "}";

    private QueryUtils(){}

    public static ArrayList<Books> fetchBooksData(){

        ArrayList<Books> books = new ArrayList<>();

        try{

            JSONObject root = new JSONObject(sampleJsonResponse);
            JSONArray items = root.getJSONArray("items");
            int counter = 0;
            while (counter<items.length()){

                JSONObject oneBook = items.getJSONObject(counter);
                JSONObject VolumeInfo = oneBook.getJSONObject("volumeInfo");
                String title = VolumeInfo.getString("title");
                String subtitle;
                String imageUrl;
                String description;
                try {
                     subtitle = VolumeInfo.getString("subtitle");
                }catch (JSONException e){
                     subtitle = "";
                }
                try {
                     description = VolumeInfo.getString("description");
                }catch (JSONException e){
                     description = "";
                }
                try {
                    JSONObject imageLinks = VolumeInfo.getJSONObject("imageLinks");

                     imageUrl = imageLinks.getString("smallThumbnail");
                }catch (JSONException e ){
                     imageUrl = "";
                }
                Books mbooks = new Books(imageUrl,title,subtitle,description);
                books.add(mbooks);
                counter++;
            }



        }catch (JSONException e){
            Log.e("QueryUtils", "Problem parsing the earthquake JSON results", e);
        }


        return books;
    }


}
