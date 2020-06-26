package com.example.booklistining;

import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class QueryUtils {
    public static final String JSON_STRING="{\n" +
            "  \"kind\": \"books#volumes\",\n" +
            "  \"totalItems\": 3539,\n" +
            "  \"items\": [\n" +
            "    {\n" +
            "      \"kind\": \"books#volume\",\n" +
            "      \"id\": \"8nm0DQAAQBAJ\",\n" +
            "      \"etag\": \"voJ6SpeEeXs\",\n" +
            "      \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/8nm0DQAAQBAJ\",\n" +
            "      \"volumeInfo\": {\n" +
            "        \"title\": \"bookdown\",\n" +
            "        \"subtitle\": \"Authoring Books and Technical Documents with R Markdown\",\n" +
            "        \"authors\": [\n" +
            "          \"Yihui Xie\"\n" +
            "        ],\n" +
            "        \"publisher\": \"CRC Press\",\n" +
            "        \"publishedDate\": \"2016-12-12\",\n" +
            "        \"description\": \"bookdown: Authoring Books and Technical Documents with R Markdown presents a much easier way to write books and technical publications than traditional tools such as LaTeX and Word. The bookdown package inherits the simplicity of syntax and flexibility for data analysis from R Markdown, and extends R Markdown for technical writing, so that you can make better use of document elements such as figures, tables, equations, theorems, citations, and references. Similar to LaTeX, you can number and cross-reference these elements with bookdown. Your document can even include live examples so readers can interact with them while reading the book. The book can be rendered to multiple output formats, including LaTeX/PDF, HTML, EPUB, and Word, thus making it easy to put your documents online. The style and theme of these output formats can be customized. We used books and R primarily for examples in this book, but bookdown is not only for books or R. Most features introduced in this book also apply to other types of publications: journal papers, reports, dissertations, course handouts, study notes, and even novels. You do not have to use R, either. Other choices of computing languages include Python, C, C++, SQL, Bash, Stan, JavaScript, and so on, although R is best supported. You can also leave out computing, for example, to write a fiction. This book itself is an example of publishing with bookdown and R Markdown, and its source is fully available on GitHub.\",\n" +
            "        \"industryIdentifiers\": [\n" +
            "          {\n" +
            "            \"type\": \"ISBN_13\",\n" +
            "            \"identifier\": \"9781351792608\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"type\": \"ISBN_10\",\n" +
            "            \"identifier\": \"1351792601\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"readingModes\": {\n" +
            "          \"text\": false,\n" +
            "          \"image\": true\n" +
            "        },\n" +
            "        \"pageCount\": 138,\n" +
            "        \"printType\": \"BOOK\",\n" +
            "        \"categories\": [\n" +
            "          \"Mathematics\"\n" +
            "        ],\n" +
            "        \"maturityRating\": \"NOT_MATURE\",\n" +
            "        \"allowAnonLogging\": true,\n" +
            "        \"contentVersion\": \"0.3.0.0.preview.1\",\n" +
            "        \"panelizationSummary\": {\n" +
            "          \"containsEpubBubbles\": false,\n" +
            "          \"containsImageBubbles\": false\n" +
            "        },\n" +
            "        \"imageLinks\": {\n" +
            "          \"smallThumbnail\": \"http://books.google.com/books/content?id=8nm0DQAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
            "          \"thumbnail\": \"http://books.google.com/books/content?id=8nm0DQAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
            "        },\n" +
            "        \"language\": \"en\",\n" +
            "        \"previewLink\": \"http://books.google.co.in/books?id=8nm0DQAAQBAJ&printsec=frontcover&dq=android+bookr&hl=&cd=1&source=gbs_api\",\n" +
            "        \"infoLink\": \"https://play.google.com/store/books/details?id=8nm0DQAAQBAJ&source=gbs_api\",\n" +
            "        \"canonicalVolumeLink\": \"https://play.google.com/store/books/details?id=8nm0DQAAQBAJ\"\n" +
            "      },\n" +
            "      \"saleInfo\": {\n" +
            "        \"country\": \"IN\",\n" +
            "        \"saleability\": \"FOR_SALE\",\n" +
            "        \"isEbook\": true,\n" +
            "        \"listPrice\": {\n" +
            "          \"amount\": 2240.82,\n" +
            "          \"currencyCode\": \"INR\"\n" +
            "        },\n" +
            "        \"retailPrice\": {\n" +
            "          \"amount\": 2240.82,\n" +
            "          \"currencyCode\": \"INR\"\n" +
            "        },\n" +
            "        \"buyLink\": \"https://play.google.com/store/books/details?id=8nm0DQAAQBAJ&rdid=book-8nm0DQAAQBAJ&rdot=1&source=gbs_api\",\n" +
            "        \"offers\": [\n" +
            "          {\n" +
            "            \"finskyOfferType\": 1,\n" +
            "            \"listPrice\": {\n" +
            "              \"amountInMicros\": 2240820000,\n" +
            "              \"currencyCode\": \"INR\"\n" +
            "            },\n" +
            "            \"retailPrice\": {\n" +
            "              \"amountInMicros\": 2240820000,\n" +
            "              \"currencyCode\": \"INR\"\n" +
            "            }\n" +
            "          }\n" +
            "        ]\n" +
            "      },\n" +
            "      \"accessInfo\": {\n" +
            "        \"country\": \"IN\",\n" +
            "        \"viewability\": \"PARTIAL\",\n" +
            "        \"embeddable\": true,\n" +
            "        \"publicDomain\": false,\n" +
            "        \"textToSpeechPermission\": \"ALLOWED\",\n" +
            "        \"epub\": {\n" +
            "          \"isAvailable\": false\n" +
            "        },\n" +
            "        \"pdf\": {\n" +
            "          \"isAvailable\": true,\n" +
            "          \"acsTokenLink\": \"http://books.google.co.in/books/download/bookdown-sample-pdf.acsm?id=8nm0DQAAQBAJ&format=pdf&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
            "        },\n" +
            "        \"webReaderLink\": \"http://play.google.com/books/reader?id=8nm0DQAAQBAJ&hl=&printsec=frontcover&source=gbs_api\",\n" +
            "        \"accessViewStatus\": \"SAMPLE\",\n" +
            "        \"quoteSharingAllowed\": false\n" +
            "      },\n" +
            "      \"searchInfo\": {\n" +
            "        \"textSnippet\": \"You can also leave out computing, for example, to write a fiction. This book itself is an example of publishing with bookdown and R Markdown, and its source is fully available on GitHub.\"\n" +
            "      }\n" +
            "    },\n" +
            "    {\n" +
            "      \"kind\": \"books#volume\",\n" +
            "      \"id\": \"z92BDwAAQBAJ\",\n" +
            "      \"etag\": \"00nMxwdokE0\",\n" +
            "      \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/z92BDwAAQBAJ\",\n" +
            "      \"volumeInfo\": {\n" +
            "        \"title\": \"Hop On Pop\",\n" +
            "        \"authors\": [\n" +
            "          \"Dr. Seuss\"\n" +
            "        ],\n" +
            "        \"publisher\": \"HarperCollins UK\",\n" +
            "        \"publishedDate\": \"2019-05-30\",\n" +
            "        \"description\": \"This charming book introduces young children to words that rhyme, with classic Dr. Seuss fun!\",\n" +
            "        \"industryIdentifiers\": [\n" +
            "          {\n" +
            "            \"type\": \"ISBN_13\",\n" +
            "            \"identifier\": \"9780008342753\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"type\": \"ISBN_10\",\n" +
            "            \"identifier\": \"000834275X\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"readingModes\": {\n" +
            "          \"text\": true,\n" +
            "          \"image\": true\n" +
            "        },\n" +
            "        \"pageCount\": 64,\n" +
            "        \"printType\": \"BOOK\",\n" +
            "        \"categories\": [\n" +
            "          \"Juvenile Fiction\"\n" +
            "        ],\n" +
            "        \"averageRating\": 3.5,\n" +
            "        \"ratingsCount\": 76,\n" +
            "        \"maturityRating\": \"NOT_MATURE\",\n" +
            "        \"allowAnonLogging\": true,\n" +
            "        \"contentVersion\": \"1.1.1.0.preview.3\",\n" +
            "        \"panelizationSummary\": {\n" +
            "          \"containsEpubBubbles\": false,\n" +
            "          \"containsImageBubbles\": false\n" +
            "        },\n" +
            "        \"imageLinks\": {\n" +
            "          \"smallThumbnail\": \"http://books.google.com/books/content?id=z92BDwAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
            "          \"thumbnail\": \"http://books.google.com/books/content?id=z92BDwAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
            "        },\n" +
            "        \"language\": \"en\",\n" +
            "        \"previewLink\": \"http://books.google.co.in/books?id=z92BDwAAQBAJ&printsec=frontcover&dq=android+bookr&hl=&cd=2&source=gbs_api\",\n" +
            "        \"infoLink\": \"https://play.google.com/store/books/details?id=z92BDwAAQBAJ&source=gbs_api\",\n" +
            "        \"canonicalVolumeLink\": \"https://play.google.com/store/books/details?id=z92BDwAAQBAJ\"\n" +
            "      },\n" +
            "      \"saleInfo\": {\n" +
            "        \"country\": \"IN\",\n" +
            "        \"saleability\": \"FOR_SALE\",\n" +
            "        \"isEbook\": true,\n" +
            "        \"listPrice\": {\n" +
            "          \"amount\": 513.63,\n" +
            "          \"currencyCode\": \"INR\"\n" +
            "        },\n" +
            "        \"retailPrice\": {\n" +
            "          \"amount\": 256.82,\n" +
            "          \"currencyCode\": \"INR\"\n" +
            "        },\n" +
            "        \"buyLink\": \"https://play.google.com/store/books/details?id=z92BDwAAQBAJ&rdid=book-z92BDwAAQBAJ&rdot=1&source=gbs_api\",\n" +
            "        \"offers\": [\n" +
            "          {\n" +
            "            \"finskyOfferType\": 1,\n" +
            "            \"listPrice\": {\n" +
            "              \"amountInMicros\": 513630000,\n" +
            "              \"currencyCode\": \"INR\"\n" +
            "            },\n" +
            "            \"retailPrice\": {\n" +
            "              \"amountInMicros\": 256820000,\n" +
            "              \"currencyCode\": \"INR\"\n" +
            "            }\n" +
            "          }\n" +
            "        ]\n" +
            "      },\n" +
            "      \"accessInfo\": {\n" +
            "        \"country\": \"IN\",\n" +
            "        \"viewability\": \"PARTIAL\",\n" +
            "        \"embeddable\": true,\n" +
            "        \"publicDomain\": false,\n" +
            "        \"textToSpeechPermission\": \"ALLOWED_FOR_ACCESSIBILITY\",\n" +
            "        \"epub\": {\n" +
            "          \"isAvailable\": true,\n" +
            "          \"acsTokenLink\": \"http://books.google.co.in/books/download/Hop_On_Pop-sample-epub.acsm?id=z92BDwAAQBAJ&format=epub&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
            "        },\n" +
            "        \"pdf\": {\n" +
            "          \"isAvailable\": true,\n" +
            "          \"acsTokenLink\": \"http://books.google.co.in/books/download/Hop_On_Pop-sample-pdf.acsm?id=z92BDwAAQBAJ&format=pdf&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
            "        },\n" +
            "        \"webReaderLink\": \"http://play.google.com/books/reader?id=z92BDwAAQBAJ&hl=&printsec=frontcover&source=gbs_api\",\n" +
            "        \"accessViewStatus\": \"SAMPLE\",\n" +
            "        \"quoteSharingAllowed\": false\n" +
            "      },\n" +
            "      \"searchInfo\": {\n" +
            "        \"textSnippet\": \"This charming book introduces young children to words that rhyme, with classic Dr. Seuss fun!\"\n" +
            "      }\n" +
            "    },\n" +
            "    {\n" +
            "      \"kind\": \"books#volume\",\n" +
            "      \"id\": \"bFTl2b80zyQC\",\n" +
            "      \"etag\": \"MBNeSvwZMWI\",\n" +
            "      \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/bFTl2b80zyQC\",\n" +
            "      \"volumeInfo\": {\n" +
            "        \"title\": \"Moonwalking with Einstein\",\n" +
            "        \"subtitle\": \"The Art and Science of Remembering Everything\",\n" +
            "        \"authors\": [\n" +
            "          \"Joshua Foer\"\n" +
            "        ],\n" +
            "        \"publisher\": \"Penguin UK\",\n" +
            "        \"publishedDate\": \"2011-04-07\",\n" +
            "        \"description\": \"'Be prepared to be amazed' Guardian Can anyone get a perfect memory? Joshua Foer used to be like most of us, forgetting phone numbers and mislaying keys. Then he learnt the art of memory training, and a year later found himself in the finals of the US Memory Championship. He also discovered a truth we often forget: that, even in an age of technology, memory is the key to everything we are. In Moonwalking with Einstein he takes us on an astonishing journey through the mind, from ancient 'memory palace' techniques to neuroscience, from the man who can recall nine thousand books to another who constantly forgets who he is. In doing so, Foer shows how we can all improve our memories. 'Captivating ... engaging ... smart and funny' The New York Times 'Delightful ... uplifting ... it shows that our minds can do extraordinary things' Wall Street Journal 'Great fun ... a book worth remembering' Independent 'A lovely exploration of the ways that we preserve our lives and our world in the golden amber of human memory' New Scientist\",\n" +
            "        \"industryIdentifiers\": [\n" +
            "          {\n" +
            "            \"type\": \"ISBN_13\",\n" +
            "            \"identifier\": \"9780141952277\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"type\": \"ISBN_10\",\n" +
            "            \"identifier\": \"014195227X\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"readingModes\": {\n" +
            "          \"text\": true,\n" +
            "          \"image\": false\n" +
            "        },\n" +
            "        \"pageCount\": 320,\n" +
            "        \"printType\": \"BOOK\",\n" +
            "        \"categories\": [\n" +
            "          \"Psychology\"\n" +
            "        ],\n" +
            "        \"averageRating\": 4,\n" +
            "        \"ratingsCount\": 80,\n" +
            "        \"maturityRating\": \"NOT_MATURE\",\n" +
            "        \"allowAnonLogging\": true,\n" +
            "        \"contentVersion\": \"1.3.3.0.preview.2\",\n" +
            "        \"panelizationSummary\": {\n" +
            "          \"containsEpubBubbles\": false,\n" +
            "          \"containsImageBubbles\": false\n" +
            "        },\n" +
            "        \"imageLinks\": {\n" +
            "          \"smallThumbnail\": \"http://books.google.com/books/content?id=bFTl2b80zyQC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
            "          \"thumbnail\": \"http://books.google.com/books/content?id=bFTl2b80zyQC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
            "        },\n" +
            "        \"language\": \"en\",\n" +
            "        \"previewLink\": \"http://books.google.co.in/books?id=bFTl2b80zyQC&printsec=frontcover&dq=android+bookr&hl=&cd=3&source=gbs_api\",\n" +
            "        \"infoLink\": \"https://play.google.com/store/books/details?id=bFTl2b80zyQC&source=gbs_api\",\n" +
            "        \"canonicalVolumeLink\": \"https://play.google.com/store/books/details?id=bFTl2b80zyQC\"\n" +
            "      },\n" +
            "      \"saleInfo\": {\n" +
            "        \"country\": \"IN\",\n" +
            "        \"saleability\": \"FOR_SALE\",\n" +
            "        \"isEbook\": true,\n" +
            "        \"listPrice\": {\n" +
            "          \"amount\": 500.32,\n" +
            "          \"currencyCode\": \"INR\"\n" +
            "        },\n" +
            "        \"retailPrice\": {\n" +
            "          \"amount\": 247.66,\n" +
            "          \"currencyCode\": \"INR\"\n" +
            "        },\n" +
            "        \"buyLink\": \"https://play.google.com/store/books/details?id=bFTl2b80zyQC&rdid=book-bFTl2b80zyQC&rdot=1&source=gbs_api\",\n" +
            "        \"offers\": [\n" +
            "          {\n" +
            "            \"finskyOfferType\": 1,\n" +
            "            \"listPrice\": {\n" +
            "              \"amountInMicros\": 500320000,\n" +
            "              \"currencyCode\": \"INR\"\n" +
            "            },\n" +
            "            \"retailPrice\": {\n" +
            "              \"amountInMicros\": 247660000,\n" +
            "              \"currencyCode\": \"INR\"\n" +
            "            }\n" +
            "          }\n" +
            "        ]\n" +
            "      },\n" +
            "      \"accessInfo\": {\n" +
            "        \"country\": \"IN\",\n" +
            "        \"viewability\": \"PARTIAL\",\n" +
            "        \"embeddable\": true,\n" +
            "        \"publicDomain\": false,\n" +
            "        \"textToSpeechPermission\": \"ALLOWED_FOR_ACCESSIBILITY\",\n" +
            "        \"epub\": {\n" +
            "          \"isAvailable\": true,\n" +
            "          \"acsTokenLink\": \"http://books.google.co.in/books/download/Moonwalking_with_Einstein-sample-epub.acsm?id=bFTl2b80zyQC&format=epub&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
            "        },\n" +
            "        \"pdf\": {\n" +
            "          \"isAvailable\": false\n" +
            "        },\n" +
            "        \"webReaderLink\": \"http://play.google.com/books/reader?id=bFTl2b80zyQC&hl=&printsec=frontcover&source=gbs_api\",\n" +
            "        \"accessViewStatus\": \"SAMPLE\",\n" +
            "        \"quoteSharingAllowed\": false\n" +
            "      },\n" +
            "      \"searchInfo\": {\n" +
            "        \"textSnippet\": \"In Moonwalking with Einstein he takes us on an astonishing journey through the mind, from ancient &#39;memory palace&#39; techniques to neuroscience, from the man who can recall nine thousand books to another who constantly forgets who he is.\"\n" +
            "      }\n" +
            "    },\n" +
            "    {\n" +
            "      \"kind\": \"books#volume\",\n" +
            "      \"id\": \"NQltAwAAQBAJ\",\n" +
            "      \"etag\": \"9QHj8IYmpqM\",\n" +
            "      \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/NQltAwAAQBAJ\",\n" +
            "      \"volumeInfo\": {\n" +
            "        \"title\": \"Calcutta Cookbook\",\n" +
            "        \"subtitle\": \"A Treasury of Recipes From Pavement to Place\",\n" +
            "        \"authors\": [\n" +
            "          \"M Dasgupta\"\n" +
            "        ],\n" +
            "        \"publisher\": \"Penguin UK\",\n" +
            "        \"publishedDate\": \"2000-10-14\",\n" +
            "        \"description\": \"The Calcutta Cookbook Is Much More Than A Cookery Book&Mdash;It Is A Culinary Chronicle Of Travellers And Traders Who Built The City That Job Charnock Founded. Calcutta 'S Chronicle Began On A Hot, Wet August Afternoon In 1690 When A Hungry Charnock Climbed Off His Ship On To The Steps Of A Muddy Ghat. The River Was Hooghly And The Place Sutanati&Hellip; The Story Of Calcutta Is Told By Three Food Lovers&Mdash;The Late Gourmet Chef And Author Of Bangla Ranna, Minakshi Das Gupta, And Feature Writers Bunny Gupta And Jaya Chaliah&Mdash;Who Have Collected Recipes From All Over The World. Many Of These Are Family Secrets Of Calcuttans Who Have Recreated Armenian, Jewish, Arabian, European, Chinese And Tibetan Dishes With Distinct Calcutta Flavour. Through Over Two Hundred Tried And Tested Recipes Ranging From The Delicious Bengali Chingri Maacher Malai Curry To The Biryani And Kebabs Of Kabul, And The Temperado, Vindaloo And Sorpotel Of Goa, Calcutta Unfolds As A Gourmet&Rsquo;S Paradise\",\n" +
            "        \"industryIdentifiers\": [\n" +
            "          {\n" +
            "            \"type\": \"ISBN_13\",\n" +
            "            \"identifier\": \"9789351181491\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"type\": \"ISBN_10\",\n" +
            "            \"identifier\": \"9351181499\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"readingModes\": {\n" +
            "          \"text\": true,\n" +
            "          \"image\": false\n" +
            "        },\n" +
            "        \"pageCount\": 420,\n" +
            "        \"printType\": \"BOOK\",\n" +
            "        \"categories\": [\n" +
            "          \"Cooking\"\n" +
            "        ],\n" +
            "        \"maturityRating\": \"NOT_MATURE\",\n" +
            "        \"allowAnonLogging\": true,\n" +
            "        \"contentVersion\": \"0.3.2.0.preview.2\",\n" +
            "        \"panelizationSummary\": {\n" +
            "          \"containsEpubBubbles\": false,\n" +
            "          \"containsImageBubbles\": false\n" +
            "        },\n" +
            "        \"imageLinks\": {\n" +
            "          \"smallThumbnail\": \"http://books.google.com/books/content?id=NQltAwAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
            "          \"thumbnail\": \"http://books.google.com/books/content?id=NQltAwAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
            "        },\n" +
            "        \"language\": \"en\",\n" +
            "        \"previewLink\": \"http://books.google.co.in/books?id=NQltAwAAQBAJ&printsec=frontcover&dq=android+bookr&hl=&cd=4&source=gbs_api\",\n" +
            "        \"infoLink\": \"https://play.google.com/store/books/details?id=NQltAwAAQBAJ&source=gbs_api\",\n" +
            "        \"canonicalVolumeLink\": \"https://play.google.com/store/books/details?id=NQltAwAAQBAJ\"\n" +
            "      },\n" +
            "      \"saleInfo\": {\n" +
            "        \"country\": \"IN\",\n" +
            "        \"saleability\": \"FOR_SALE\",\n" +
            "        \"isEbook\": true,\n" +
            "        \"listPrice\": {\n" +
            "          \"amount\": 358.72,\n" +
            "          \"currencyCode\": \"INR\"\n" +
            "        },\n" +
            "        \"retailPrice\": {\n" +
            "          \"amount\": 251.1,\n" +
            "          \"currencyCode\": \"INR\"\n" +
            "        },\n" +
            "        \"buyLink\": \"https://play.google.com/store/books/details?id=NQltAwAAQBAJ&rdid=book-NQltAwAAQBAJ&rdot=1&source=gbs_api\",\n" +
            "        \"offers\": [\n" +
            "          {\n" +
            "            \"finskyOfferType\": 1,\n" +
            "            \"listPrice\": {\n" +
            "              \"amountInMicros\": 358720000,\n" +
            "              \"currencyCode\": \"INR\"\n" +
            "            },\n" +
            "            \"retailPrice\": {\n" +
            "              \"amountInMicros\": 251100000,\n" +
            "              \"currencyCode\": \"INR\"\n" +
            "            }\n" +
            "          }\n" +
            "        ]\n" +
            "      },\n" +
            "      \"accessInfo\": {\n" +
            "        \"country\": \"IN\",\n" +
            "        \"viewability\": \"PARTIAL\",\n" +
            "        \"embeddable\": true,\n" +
            "        \"publicDomain\": false,\n" +
            "        \"textToSpeechPermission\": \"ALLOWED\",\n" +
            "        \"epub\": {\n" +
            "          \"isAvailable\": true,\n" +
            "          \"acsTokenLink\": \"http://books.google.co.in/books/download/Calcutta_Cookbook-sample-epub.acsm?id=NQltAwAAQBAJ&format=epub&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
            "        },\n" +
            "        \"pdf\": {\n" +
            "          \"isAvailable\": false\n" +
            "        },\n" +
            "        \"webReaderLink\": \"http://play.google.com/books/reader?id=NQltAwAAQBAJ&hl=&printsec=frontcover&source=gbs_api\",\n" +
            "        \"accessViewStatus\": \"SAMPLE\",\n" +
            "        \"quoteSharingAllowed\": false\n" +
            "      },\n" +
            "      \"searchInfo\": {\n" +
            "        \"textSnippet\": \"Many Of These Are Family Secrets Of Calcuttans Who Have Recreated Armenian, Jewish, Arabian, European, Chinese And Tibetan Dishes With Distinct Calcutta Flavour.\"\n" +
            "      }\n" +
            "    },\n" +
            "    {\n" +
            "      \"kind\": \"books#volume\",\n" +
            "      \"id\": \"OfIwDwAAQBAJ\",\n" +
            "      \"etag\": \"TWnk0AVN+qk\",\n" +
            "      \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/OfIwDwAAQBAJ\",\n" +
            "      \"volumeInfo\": {\n" +
            "        \"title\": \"Goldfinger\",\n" +
            "        \"authors\": [\n" +
            "          \"Ian Fleming\"\n" +
            "        ],\n" +
            "        \"publisher\": \"Pickle Partners Publishing\",\n" +
            "        \"publishedDate\": \"2017-07-11\",\n" +
            "        \"description\": \"“Keep away from MR. AURIC GOLDFINGER. He is a most powerful man. If he wished to crush you, he would only have to roll over in his sleep to do so.” OPERATION GRAND SLAM Secret agent James Bond had been warned not to tangle with Goldfinger. But the super-criminal’s latest obsession was too strong, too dangerous. He had to be stopped. Goldfinger was determined to take possession of half the supply of mined gold in the world—to rob Fort Knox! For this incredible venture he had enlisted the aid of the top criminals in the U.S., including a bevy of beautiful thieves from the Bronx. And he had conceived so foolproof a plan that it would take all of Bond’s unique talents to make it fail—as fail it must. JAMES BOND challenges GOLDFINGER, THE MOST EVIL GENIUS HE HAS EVER FACED. He’s a phenomenal criminal who likes his women dressed only in gold paint. He’s a magnificent fiend who carries his cash in gold bars. He’s a powerful villain who plans to pull the biggest and boldest crime in history—the robbery of all the gold in Fort Knox. “It’s all marvellously intricate and polished storytelling, all absurdly impossible, all superlative fun.”—Cleveland News. “We recommend Goldfinger for just what it is: sophisticated, tongue-in-cheek entertainment par excellence.”—Playboy Magazine. “If you like heroes heroic, a woman who proves, finally, that she’s all woman, and a villain who is a dirty dog, then Goldfinger is for you.”—Detroit Sunday Times.\",\n" +
            "        \"industryIdentifiers\": [\n" +
            "          {\n" +
            "            \"type\": \"ISBN_13\",\n" +
            "            \"identifier\": \"9781787206502\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"type\": \"ISBN_10\",\n" +
            "            \"identifier\": \"1787206505\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"readingModes\": {\n" +
            "          \"text\": true,\n" +
            "          \"image\": false\n" +
            "        },\n" +
            "        \"pageCount\": 229,\n" +
            "        \"printType\": \"BOOK\",\n" +
            "        \"categories\": [\n" +
            "          \"History\"\n" +
            "        ],\n" +
            "        \"averageRating\": 3.5,\n" +
            "        \"ratingsCount\": 24,\n" +
            "        \"maturityRating\": \"NOT_MATURE\",\n" +
            "        \"allowAnonLogging\": true,\n" +
            "        \"contentVersion\": \"1.1.2.0.preview.2\",\n" +
            "        \"panelizationSummary\": {\n" +
            "          \"containsEpubBubbles\": false,\n" +
            "          \"containsImageBubbles\": false\n" +
            "        },\n" +
            "        \"imageLinks\": {\n" +
            "          \"smallThumbnail\": \"http://books.google.com/books/content?id=OfIwDwAAQBAJ&printsec=frontcover&img=1&zoom=5&source=gbs_api\",\n" +
            "          \"thumbnail\": \"http://books.google.com/books/content?id=OfIwDwAAQBAJ&printsec=frontcover&img=1&zoom=1&source=gbs_api\"\n" +
            "        },\n" +
            "        \"language\": \"en\",\n" +
            "        \"previewLink\": \"http://books.google.co.in/books?id=OfIwDwAAQBAJ&dq=android+bookr&hl=&cd=5&source=gbs_api\",\n" +
            "        \"infoLink\": \"http://books.google.co.in/books?id=OfIwDwAAQBAJ&dq=android+bookr&hl=&source=gbs_api\",\n" +
            "        \"canonicalVolumeLink\": \"https://books.google.com/books/about/Goldfinger.html?hl=&id=OfIwDwAAQBAJ\"\n" +
            "      },\n" +
            "      \"saleInfo\": {\n" +
            "        \"country\": \"IN\",\n" +
            "        \"saleability\": \"NOT_FOR_SALE\",\n" +
            "        \"isEbook\": false\n" +
            "      },\n" +
            "      \"accessInfo\": {\n" +
            "        \"country\": \"IN\",\n" +
            "        \"viewability\": \"NO_PAGES\",\n" +
            "        \"embeddable\": false,\n" +
            "        \"publicDomain\": false,\n" +
            "        \"textToSpeechPermission\": \"ALLOWED\",\n" +
            "        \"epub\": {\n" +
            "          \"isAvailable\": true\n" +
            "        },\n" +
            "        \"pdf\": {\n" +
            "          \"isAvailable\": true\n" +
            "        },\n" +
            "        \"webReaderLink\": \"http://play.google.com/books/reader?id=OfIwDwAAQBAJ&hl=&printsec=frontcover&source=gbs_api\",\n" +
            "        \"accessViewStatus\": \"NONE\",\n" +
            "        \"quoteSharingAllowed\": false\n" +
            "      },\n" +
            "      \"searchInfo\": {\n" +
            "        \"textSnippet\": \"But the super-criminal’s latest obsession was too strong, too dangerous. He had to be stopped. Goldfinger was determined to take possession of half the supply of mined gold in the world—to rob Fort Knox!\"\n" +
            "      }\n" +
            "    },\n" +
            "    {\n" +
            "      \"kind\": \"books#volume\",\n" +
            "      \"id\": \"aISTyAEACAAJ\",\n" +
            "      \"etag\": \"1O3pqqgkCNo\",\n" +
            "      \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/aISTyAEACAAJ\",\n" +
            "      \"volumeInfo\": {\n" +
            "        \"title\": \"Colour My Dreams\",\n" +
            "        \"authors\": [\n" +
            "          \"Geraldine Kumar\"\n" +
            "        ],\n" +
            "        \"publishedDate\": \"2019-08-13\",\n" +
            "        \"description\": \"'Dreams keep you alive hence keep your dreams alive'If you have confidence and belief in yourself and you're determined to tread on the path of dedication, for sure success is not away from you.This anthology is a collection of poems of various writers portraying dreams and desires of hearts in multiple aspects of life. Be it career, love, life, ambition etc. For a dream to provide fuel for reality, it can't be random.Each of us have so many desires swirling in our minds wondering from where to start, which one is achievable or not. It is self-belief that puts dreams into action.Only if one is accustomed to persevering can one accomplish one's dream.For a writer, it is one's dream to be a published writer, to be read and appreciated by many and also to inspire and touch lives through words.Likewise in real life situations too dreams of many deserving souls, some explore their dreams while some dreams are embedded in hearts.To achieve real benefit one's spirit needs to be reflected in one's ambition. Actively working on one's dream to keep it alive.- Geraldine Kumar\",\n" +
            "        \"industryIdentifiers\": [\n" +
            "          {\n" +
            "            \"type\": \"ISBN_10\",\n" +
            "            \"identifier\": \"1686120869\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"type\": \"ISBN_13\",\n" +
            "            \"identifier\": \"9781686120862\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"readingModes\": {\n" +
            "          \"text\": false,\n" +
            "          \"image\": false\n" +
            "        },\n" +
            "        \"pageCount\": 196,\n" +
            "        \"printType\": \"BOOK\",\n" +
            "        \"maturityRating\": \"NOT_MATURE\",\n" +
            "        \"allowAnonLogging\": false,\n" +
            "        \"contentVersion\": \"preview-1.0.0\",\n" +
            "        \"panelizationSummary\": {\n" +
            "          \"containsEpubBubbles\": false,\n" +
            "          \"containsImageBubbles\": false\n" +
            "        },\n" +
            "        \"imageLinks\": {\n" +
            "          \"smallThumbnail\": \"http://books.google.com/books/content?id=aISTyAEACAAJ&printsec=frontcover&img=1&zoom=5&source=gbs_api\",\n" +
            "          \"thumbnail\": \"http://books.google.com/books/content?id=aISTyAEACAAJ&printsec=frontcover&img=1&zoom=1&source=gbs_api\"\n" +
            "        },\n" +
            "        \"language\": \"en\",\n" +
            "        \"previewLink\": \"http://books.google.co.in/books?id=aISTyAEACAAJ&dq=android+bookr&hl=&cd=6&source=gbs_api\",\n" +
            "        \"infoLink\": \"http://books.google.co.in/books?id=aISTyAEACAAJ&dq=android+bookr&hl=&source=gbs_api\",\n" +
            "        \"canonicalVolumeLink\": \"https://books.google.com/books/about/Colour_My_Dreams.html?hl=&id=aISTyAEACAAJ\"\n" +
            "      },\n" +
            "      \"saleInfo\": {\n" +
            "        \"country\": \"IN\",\n" +
            "        \"saleability\": \"NOT_FOR_SALE\",\n" +
            "        \"isEbook\": false\n" +
            "      },\n" +
            "      \"accessInfo\": {\n" +
            "        \"country\": \"IN\",\n" +
            "        \"viewability\": \"NO_PAGES\",\n" +
            "        \"embeddable\": false,\n" +
            "        \"publicDomain\": false,\n" +
            "        \"textToSpeechPermission\": \"ALLOWED\",\n" +
            "        \"epub\": {\n" +
            "          \"isAvailable\": false\n" +
            "        },\n" +
            "        \"pdf\": {\n" +
            "          \"isAvailable\": false\n" +
            "        },\n" +
            "        \"webReaderLink\": \"http://play.google.com/books/reader?id=aISTyAEACAAJ&hl=&printsec=frontcover&source=gbs_api\",\n" +
            "        \"accessViewStatus\": \"NONE\",\n" +
            "        \"quoteSharingAllowed\": false\n" +
            "      },\n" +
            "      \"searchInfo\": {\n" +
            "        \"textSnippet\": \"Actively working on one&#39;s dream to keep it alive.- Geraldine Kumar\"\n" +
            "      }\n" +
            "    },\n" +
            "    {\n" +
            "      \"kind\": \"books#volume\",\n" +
            "      \"id\": \"A8ITv7Py6q8C\",\n" +
            "      \"etag\": \"Gvuw6Xqqt3Y\",\n" +
            "      \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/A8ITv7Py6q8C\",\n" +
            "      \"volumeInfo\": {\n" +
            "        \"title\": \"Blue Lipstick\",\n" +
            "        \"subtitle\": \"Concrete Poems\",\n" +
            "        \"authors\": [\n" +
            "          \"John Grandits\"\n" +
            "        ],\n" +
            "        \"publisher\": \"Houghton Mifflin Harcourt\",\n" +
            "        \"publishedDate\": \"2007\",\n" +
            "        \"description\": \"Presents a collection of poems in which fifteen-year-old Jessie voices such teenage concerns as making new friends, getting along with an annoying younger brother, finding the right makeup and hairstyle, playing volleyball, and attending school prep rallies.\",\n" +
            "        \"industryIdentifiers\": [\n" +
            "          {\n" +
            "            \"type\": \"ISBN_10\",\n" +
            "            \"identifier\": \"0618851321\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"type\": \"ISBN_13\",\n" +
            "            \"identifier\": \"9780618851324\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"readingModes\": {\n" +
            "          \"text\": false,\n" +
            "          \"image\": true\n" +
            "        },\n" +
            "        \"pageCount\": 48,\n" +
            "        \"printType\": \"BOOK\",\n" +
            "        \"categories\": [\n" +
            "          \"Juvenile Nonfiction\"\n" +
            "        ],\n" +
            "        \"averageRating\": 4,\n" +
            "        \"ratingsCount\": 39,\n" +
            "        \"maturityRating\": \"NOT_MATURE\",\n" +
            "        \"allowAnonLogging\": true,\n" +
            "        \"contentVersion\": \"2.0.0.0.preview.1\",\n" +
            "        \"imageLinks\": {\n" +
            "          \"smallThumbnail\": \"http://books.google.com/books/content?id=A8ITv7Py6q8C&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
            "          \"thumbnail\": \"http://books.google.com/books/content?id=A8ITv7Py6q8C&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
            "        },\n" +
            "        \"language\": \"en\",\n" +
            "        \"previewLink\": \"http://books.google.co.in/books?id=A8ITv7Py6q8C&printsec=frontcover&dq=android+bookr&hl=&cd=7&source=gbs_api\",\n" +
            "        \"infoLink\": \"http://books.google.co.in/books?id=A8ITv7Py6q8C&dq=android+bookr&hl=&source=gbs_api\",\n" +
            "        \"canonicalVolumeLink\": \"https://books.google.com/books/about/Blue_Lipstick.html?hl=&id=A8ITv7Py6q8C\"\n" +
            "      },\n" +
            "      \"saleInfo\": {\n" +
            "        \"country\": \"IN\",\n" +
            "        \"saleability\": \"NOT_FOR_SALE\",\n" +
            "        \"isEbook\": false\n" +
            "      },\n" +
            "      \"accessInfo\": {\n" +
            "        \"country\": \"IN\",\n" +
            "        \"viewability\": \"PARTIAL\",\n" +
            "        \"embeddable\": true,\n" +
            "        \"publicDomain\": false,\n" +
            "        \"textToSpeechPermission\": \"ALLOWED\",\n" +
            "        \"epub\": {\n" +
            "          \"isAvailable\": false\n" +
            "        },\n" +
            "        \"pdf\": {\n" +
            "          \"isAvailable\": true,\n" +
            "          \"acsTokenLink\": \"http://books.google.co.in/books/download/Blue_Lipstick-sample-pdf.acsm?id=A8ITv7Py6q8C&format=pdf&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
            "        },\n" +
            "        \"webReaderLink\": \"http://play.google.com/books/reader?id=A8ITv7Py6q8C&hl=&printsec=frontcover&source=gbs_api\",\n" +
            "        \"accessViewStatus\": \"SAMPLE\",\n" +
            "        \"quoteSharingAllowed\": false\n" +
            "      },\n" +
            "      \"searchInfo\": {\n" +
            "        \"textSnippet\": \"Presents a collection of poems in which fifteen-year-old Jessie voices such teenage concerns as making new friends, getting along with an annoying younger brother, finding the right makeup and hairstyle, playing volleyball, and attending ...\"\n" +
            "      }\n" +
            "    },\n" +
            "    {\n" +
            "      \"kind\": \"books#volume\",\n" +
            "      \"id\": \"sClUDwAAQBAJ\",\n" +
            "      \"etag\": \"QDAsXU/58Ec\",\n" +
            "      \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/sClUDwAAQBAJ\",\n" +
            "      \"volumeInfo\": {\n" +
            "        \"title\": \"Bad Blood\",\n" +
            "        \"subtitle\": \"Secrets and Lies in a Silicon Valley Startup\",\n" +
            "        \"authors\": [\n" +
            "          \"John Carreyrou\"\n" +
            "        ],\n" +
            "        \"publisher\": \"Pan Macmillan\",\n" +
            "        \"publishedDate\": \"2018-05-31\",\n" +
            "        \"description\": \"'I couldn’t put down this thriller . . . the perfect book to read by the fire this winter.' Bill Gates, '5 books I loved in 2018' WINNER OF THE FINANCIAL TIMES/MCKINSEY BUSINESS BOOK OF THE YEAR AWARD 2018 The full inside story of the breathtaking rise and shocking collapse of Theranos, the multibillion-dollar biotech startup, by the prize-winning journalist who first broke the story and pursued it to the end, despite pressure from its charismatic CEO and threats by her lawyers. In 2014, Theranos founder and CEO Elizabeth Holmes was widely seen as the female Steve Jobs: a brilliant Stanford dropout whose startup \\\"unicorn\\\" promised to revolutionize the medical industry with a machine that would make blood testing significantly faster and easier. Backed by investors such as Larry Ellison and Tim Draper, Theranos sold shares in a fundraising round that valued the company at more than $9 billion, putting Holmes's worth at an estimated $4.7 billion. There was just one problem: The technology didn't work. In Bad Blood, John Carreyrou tells the riveting story of the biggest corporate fraud since Enron, a tale of ambition and hubris set amid the bold promises of Silicon Valley. Now to be adapted into a film, with Jennifer Lawrence to star. 'Chilling . . . Reads like a West Coast version of All the President’s Men.' New York Times Book Review\",\n" +
            "        \"industryIdentifiers\": [\n" +
            "          {\n" +
            "            \"type\": \"ISBN_13\",\n" +
            "            \"identifier\": \"9781509868094\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"type\": \"ISBN_10\",\n" +
            "            \"identifier\": \"1509868097\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"readingModes\": {\n" +
            "          \"text\": true,\n" +
            "          \"image\": false\n" +
            "        },\n" +
            "        \"printType\": \"BOOK\",\n" +
            "        \"categories\": [\n" +
            "          \"True Crime\"\n" +
            "        ],\n" +
            "        \"averageRating\": 4,\n" +
            "        \"ratingsCount\": 48,\n" +
            "        \"maturityRating\": \"NOT_MATURE\",\n" +
            "        \"allowAnonLogging\": true,\n" +
            "        \"contentVersion\": \"1.12.10.0.preview.2\",\n" +
            "        \"panelizationSummary\": {\n" +
            "          \"containsEpubBubbles\": false,\n" +
            "          \"containsImageBubbles\": false\n" +
            "        },\n" +
            "        \"imageLinks\": {\n" +
            "          \"smallThumbnail\": \"http://books.google.com/books/content?id=sClUDwAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
            "          \"thumbnail\": \"http://books.google.com/books/content?id=sClUDwAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
            "        },\n" +
            "        \"language\": \"en\",\n" +
            "        \"previewLink\": \"http://books.google.co.in/books?id=sClUDwAAQBAJ&printsec=frontcover&dq=android+bookr&hl=&cd=8&source=gbs_api\",\n" +
            "        \"infoLink\": \"https://play.google.com/store/books/details?id=sClUDwAAQBAJ&source=gbs_api\",\n" +
            "        \"canonicalVolumeLink\": \"https://play.google.com/store/books/details?id=sClUDwAAQBAJ\"\n" +
            "      },\n" +
            "      \"saleInfo\": {\n" +
            "        \"country\": \"IN\",\n" +
            "        \"saleability\": \"FOR_SALE\",\n" +
            "        \"isEbook\": true,\n" +
            "        \"listPrice\": {\n" +
            "          \"amount\": 560.78,\n" +
            "          \"currencyCode\": \"INR\"\n" +
            "        },\n" +
            "        \"retailPrice\": {\n" +
            "          \"amount\": 353.29,\n" +
            "          \"currencyCode\": \"INR\"\n" +
            "        },\n" +
            "        \"buyLink\": \"https://play.google.com/store/books/details?id=sClUDwAAQBAJ&rdid=book-sClUDwAAQBAJ&rdot=1&source=gbs_api\",\n" +
            "        \"offers\": [\n" +
            "          {\n" +
            "            \"finskyOfferType\": 1,\n" +
            "            \"listPrice\": {\n" +
            "              \"amountInMicros\": 560780000,\n" +
            "              \"currencyCode\": \"INR\"\n" +
            "            },\n" +
            "            \"retailPrice\": {\n" +
            "              \"amountInMicros\": 353290000,\n" +
            "              \"currencyCode\": \"INR\"\n" +
            "            }\n" +
            "          }\n" +
            "        ]\n" +
            "      },\n" +
            "      \"accessInfo\": {\n" +
            "        \"country\": \"IN\",\n" +
            "        \"viewability\": \"PARTIAL\",\n" +
            "        \"embeddable\": true,\n" +
            "        \"publicDomain\": false,\n" +
            "        \"textToSpeechPermission\": \"ALLOWED_FOR_ACCESSIBILITY\",\n" +
            "        \"epub\": {\n" +
            "          \"isAvailable\": true,\n" +
            "          \"acsTokenLink\": \"http://books.google.co.in/books/download/Bad_Blood-sample-epub.acsm?id=sClUDwAAQBAJ&format=epub&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
            "        },\n" +
            "        \"pdf\": {\n" +
            "          \"isAvailable\": false\n" +
            "        },\n" +
            "        \"webReaderLink\": \"http://play.google.com/books/reader?id=sClUDwAAQBAJ&hl=&printsec=frontcover&source=gbs_api\",\n" +
            "        \"accessViewStatus\": \"SAMPLE\",\n" +
            "        \"quoteSharingAllowed\": false\n" +
            "      },\n" +
            "      \"searchInfo\": {\n" +
            "        \"textSnippet\": \"&#39;I couldn’t put down this thriller . . . the perfect book to read by the fire this winter.\"\n" +
            "      }\n" +
            "    },\n" +
            "    {\n" +
            "      \"kind\": \"books#volume\",\n" +
            "      \"id\": \"DkK-DwAAQBAJ\",\n" +
            "      \"etag\": \"7XSEn7Ibmio\",\n" +
            "      \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/DkK-DwAAQBAJ\",\n" +
            "      \"volumeInfo\": {\n" +
            "        \"title\": \"The Crooked Branch\",\n" +
            "        \"authors\": [\n" +
            "          \"Jeanine Cummins\"\n" +
            "        ],\n" +
            "        \"publisher\": \"Hachette UK\",\n" +
            "        \"publishedDate\": \"2020-01-27\",\n" +
            "        \"description\": \"'Rich and intricately drawn... luminous prose' Carolyn Parkhurst After the birth of her daughter Emma, the usually resilient Majella finds herself feeling isolated and exhausted. Then, at her childhood home, Majella discovers the diary of her maternal ancestor Ginny, and is shocked to read a story of murder in her family history. With the famine upon her, Ginny Doyle fled from Ireland to America, but not all of her family made it. What happened during those harrowing years, and why does Ginny call herself a killer? Is Majella genetically fated to be a bad mother, despite the fierce tenderness she feels for her baby? Determined to uncover the truth of her heritage and her own identity, Majella sets out to explore Ginny's past - and discovers surprising truths about her family and ultimately, herself.\",\n" +
            "        \"industryIdentifiers\": [\n" +
            "          {\n" +
            "            \"type\": \"ISBN_13\",\n" +
            "            \"identifier\": \"9781472272867\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"type\": \"ISBN_10\",\n" +
            "            \"identifier\": \"1472272862\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"readingModes\": {\n" +
            "          \"text\": true,\n" +
            "          \"image\": false\n" +
            "        },\n" +
            "        \"pageCount\": 352,\n" +
            "        \"printType\": \"BOOK\",\n" +
            "        \"categories\": [\n" +
            "          \"Fiction\"\n" +
            "        ],\n" +
            "        \"averageRating\": 4.5,\n" +
            "        \"ratingsCount\": 5,\n" +
            "        \"maturityRating\": \"NOT_MATURE\",\n" +
            "        \"allowAnonLogging\": true,\n" +
            "        \"contentVersion\": \"1.3.3.0.preview.2\",\n" +
            "        \"panelizationSummary\": {\n" +
            "          \"containsEpubBubbles\": false,\n" +
            "          \"containsImageBubbles\": false\n" +
            "        },\n" +
            "        \"imageLinks\": {\n" +
            "          \"smallThumbnail\": \"http://books.google.com/books/content?id=DkK-DwAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
            "          \"thumbnail\": \"http://books.google.com/books/content?id=DkK-DwAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
            "        },\n" +
            "        \"language\": \"en\",\n" +
            "        \"previewLink\": \"http://books.google.co.in/books?id=DkK-DwAAQBAJ&printsec=frontcover&dq=android+bookr&hl=&cd=9&source=gbs_api\",\n" +
            "        \"infoLink\": \"https://play.google.com/store/books/details?id=DkK-DwAAQBAJ&source=gbs_api\",\n" +
            "        \"canonicalVolumeLink\": \"https://play.google.com/store/books/details?id=DkK-DwAAQBAJ\"\n" +
            "      },\n" +
            "      \"saleInfo\": {\n" +
            "        \"country\": \"IN\",\n" +
            "        \"saleability\": \"FOR_SALE\",\n" +
            "        \"isEbook\": true,\n" +
            "        \"listPrice\": {\n" +
            "          \"amount\": 554.6,\n" +
            "          \"currencyCode\": \"INR\"\n" +
            "        },\n" +
            "        \"retailPrice\": {\n" +
            "          \"amount\": 277.3,\n" +
            "          \"currencyCode\": \"INR\"\n" +
            "        },\n" +
            "        \"buyLink\": \"https://play.google.com/store/books/details?id=DkK-DwAAQBAJ&rdid=book-DkK-DwAAQBAJ&rdot=1&source=gbs_api\",\n" +
            "        \"offers\": [\n" +
            "          {\n" +
            "            \"finskyOfferType\": 1,\n" +
            "            \"listPrice\": {\n" +
            "              \"amountInMicros\": 554600000,\n" +
            "              \"currencyCode\": \"INR\"\n" +
            "            },\n" +
            "            \"retailPrice\": {\n" +
            "              \"amountInMicros\": 277300000,\n" +
            "              \"currencyCode\": \"INR\"\n" +
            "            }\n" +
            "          }\n" +
            "        ]\n" +
            "      },\n" +
            "      \"accessInfo\": {\n" +
            "        \"country\": \"IN\",\n" +
            "        \"viewability\": \"PARTIAL\",\n" +
            "        \"embeddable\": true,\n" +
            "        \"publicDomain\": false,\n" +
            "        \"textToSpeechPermission\": \"ALLOWED_FOR_ACCESSIBILITY\",\n" +
            "        \"epub\": {\n" +
            "          \"isAvailable\": true,\n" +
            "          \"acsTokenLink\": \"http://books.google.co.in/books/download/The_Crooked_Branch-sample-epub.acsm?id=DkK-DwAAQBAJ&format=epub&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
            "        },\n" +
            "        \"pdf\": {\n" +
            "          \"isAvailable\": false\n" +
            "        },\n" +
            "        \"webReaderLink\": \"http://play.google.com/books/reader?id=DkK-DwAAQBAJ&hl=&printsec=frontcover&source=gbs_api\",\n" +
            "        \"accessViewStatus\": \"SAMPLE\",\n" +
            "        \"quoteSharingAllowed\": false\n" +
            "      },\n" +
            "      \"searchInfo\": {\n" +
            "        \"textSnippet\": \"&#39;Rich and intricately drawn... luminous prose&#39; Carolyn Parkhurst After the birth of her daughter Emma, the usually resilient Majella finds herself feeling isolated and exhausted.\"\n" +
            "      }\n" +
            "    },\n" +
            "    {\n" +
            "      \"kind\": \"books#volume\",\n" +
            "      \"id\": \"xCAD8ashi_UC\",\n" +
            "      \"etag\": \"UdMiukFfOJQ\",\n" +
            "      \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/xCAD8ashi_UC\",\n" +
            "      \"volumeInfo\": {\n" +
            "        \"title\": \"A Sense of Urgency\",\n" +
            "        \"authors\": [\n" +
            "          \"John P. Kotter\"\n" +
            "        ],\n" +
            "        \"publisher\": \"Harvard Business Press\",\n" +
            "        \"publishedDate\": \"2008\",\n" +
            "        \"description\": \"In his international bestseller \\\"Leading Change,\\\" Kotter provided an action plan for implementing successful transformations. Now, he shines the spotlight on the crucial first step in his framework: creating a sense of urgency by getting people to actually see and feel the need for change.\",\n" +
            "        \"industryIdentifiers\": [\n" +
            "          {\n" +
            "            \"type\": \"ISBN_13\",\n" +
            "            \"identifier\": \"9781422179710\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"type\": \"ISBN_10\",\n" +
            "            \"identifier\": \"1422179710\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"readingModes\": {\n" +
            "          \"text\": true,\n" +
            "          \"image\": true\n" +
            "        },\n" +
            "        \"pageCount\": 196,\n" +
            "        \"printType\": \"BOOK\",\n" +
            "        \"categories\": [\n" +
            "          \"Business & Economics\"\n" +
            "        ],\n" +
            "        \"averageRating\": 4,\n" +
            "        \"ratingsCount\": 9,\n" +
            "        \"maturityRating\": \"NOT_MATURE\",\n" +
            "        \"allowAnonLogging\": true,\n" +
            "        \"contentVersion\": \"0.3.2.0.preview.3\",\n" +
            "        \"panelizationSummary\": {\n" +
            "          \"containsEpubBubbles\": false,\n" +
            "          \"containsImageBubbles\": false\n" +
            "        },\n" +
            "        \"imageLinks\": {\n" +
            "          \"smallThumbnail\": \"http://books.google.com/books/content?id=xCAD8ashi_UC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
            "          \"thumbnail\": \"http://books.google.com/books/content?id=xCAD8ashi_UC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
            "        },\n" +
            "        \"language\": \"en\",\n" +
            "        \"previewLink\": \"http://books.google.co.in/books?id=xCAD8ashi_UC&printsec=frontcover&dq=android+bookr&hl=&cd=10&source=gbs_api\",\n" +
            "        \"infoLink\": \"http://books.google.co.in/books?id=xCAD8ashi_UC&dq=android+bookr&hl=&source=gbs_api\",\n" +
            "        \"canonicalVolumeLink\": \"https://books.google.com/books/about/A_Sense_of_Urgency.html?hl=&id=xCAD8ashi_UC\"\n" +
            "      },\n" +
            "      \"saleInfo\": {\n" +
            "        \"country\": \"IN\",\n" +
            "        \"saleability\": \"NOT_FOR_SALE\",\n" +
            "        \"isEbook\": false\n" +
            "      },\n" +
            "      \"accessInfo\": {\n" +
            "        \"country\": \"IN\",\n" +
            "        \"viewability\": \"PARTIAL\",\n" +
            "        \"embeddable\": true,\n" +
            "        \"publicDomain\": false,\n" +
            "        \"textToSpeechPermission\": \"ALLOWED\",\n" +
            "        \"epub\": {\n" +
            "          \"isAvailable\": true,\n" +
            "          \"acsTokenLink\": \"http://books.google.co.in/books/download/A_Sense_of_Urgency-sample-epub.acsm?id=xCAD8ashi_UC&format=epub&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
            "        },\n" +
            "        \"pdf\": {\n" +
            "          \"isAvailable\": true,\n" +
            "          \"acsTokenLink\": \"http://books.google.co.in/books/download/A_Sense_of_Urgency-sample-pdf.acsm?id=xCAD8ashi_UC&format=pdf&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
            "        },\n" +
            "        \"webReaderLink\": \"http://play.google.com/books/reader?id=xCAD8ashi_UC&hl=&printsec=frontcover&source=gbs_api\",\n" +
            "        \"accessViewStatus\": \"SAMPLE\",\n" +
            "        \"quoteSharingAllowed\": false\n" +
            "      },\n" +
            "      \"searchInfo\": {\n" +
            "        \"textSnippet\": \"Now, he shines the spotlight on the crucial first step in his framework: creating a sense of urgency by getting people to actually see and feel the need for change.\"\n" +
            "      }\n" +
            "    }\n" +
            "  ]\n" +
            "}";


    private QueryUtils() {

    }

    public static ArrayList<Custom> extractBookList() {
        ArrayList<Custom> bookList = new ArrayList<>();
        try {
            //Create a JSONObject from the JSON_STRING
            JSONObject rootObject = new JSONObject(JSON_STRING);
            // Extract the JSONArray associated with the key called "items",
            // which represents a list of items (or books).
            JSONArray itemsArray = rootObject.getJSONArray("items");

            for(int i = 0; i < itemsArray.length(); i++){
                JSONObject currentBook = itemsArray.getJSONObject(i);
                JSONObject volumeInfo = currentBook.getJSONObject("volumeInfo");
                //JSONObject imageLinks = currentBook.getJSONObject("imageLinks");
                //String bookImage = imageLinks.getString("thumbnail");
                String title = volumeInfo.getString("title");
                //String subTitle = volumeInfo.getString("subtitle");

                Custom book = new Custom(title);
                bookList.add(book);
        }
        }catch (Exception e){
            e.printStackTrace();
        }
        return bookList;
    }

}
