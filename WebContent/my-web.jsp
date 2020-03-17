<%@ page language="java" contentType="text/html; charset=windows-1255"
	pageEncoding="windows-1255"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html lang="en">

<head>
<meta charset="UTF-8">

<title>webTest</title>

<style type="text/css">
.menus {
	font-size: 00px;
	background-color: gray;
}

.program_summary {
	float: right;
	font background-color: rebeccapurple;
	border-bottom-color: blue;
}

.math_sum {
	float: right;
}

.programing_practice {
	float: right;
}

.math_practice {
	float: right;
}

.p1 {
	color: black;
	direction: rtl;
	text-align: right;
	border-style: inset;
	border-left:
}

.titles {
	direction: rtl;
}
</style>
</head>

<body>

	<br>
	<br>
	<br>
	<c:choose>
		<c:when test="${!vaild}">
		    <a href="register.html"> הרשמה</a>
		    <br>
			<a href="log-in.html"> התחברות</a>
		</c:when>
		<c:otherwise>
			<a href="LogOutServlet"> יציאה</a>
		</c:otherwise>
	</c:choose>

	<div class="menus">

		<!-- login form -get user name and password and verify the  data  -->



		<div class="program_summary">
			<button>
				<a href="my-web.jsp">דף הבית</a>
			</button>
		</div>
		<div class="program_summary">
			<button>סיכום בתכנות</button>
		</div>
		<div class="math_sum">
			<button>סיכומימים במתמטיקה</button>
		</div>
		<div class="programing_practice">
			<button>
				<a href="problems-page.jsp">תרגול בתיכנות</a>
			</button>
		</div>
		<div class="math_practice">
			<button>תירגול במתמטיקה</button>
		</div>

	</div>
	<br>
	<br>
	<br>
	<div class="titles">


		<h1>באתר זה נתמקד בשלושת הדברים הבאים</h1>
		<h2>1 בעיות תיכנות</h2>
		<h2>2 מתמטיקה</h2>
		<h2>3 סיכומים במתמטיקה/תיכנות</h2>
	</div>

	<div class="p1">
		<h3>
			<p>
				<em>אז החלטתם שאתם רוצים ללמוד תכנות. כל הכבוד! <br> אבל
					מה עושים עכשיו? מאיפה מתחילים? הרי יש כל כך הרבה ידע בעולם התכנות
					וכל כך הרבה קורסים באינטרנט. <br> גם אם מצמצמים את זה לתכנות
					צד-לקוח (תכנות פרונט-אנד), <br> האפשרויות עדיין בלתי מוגבלות
					וזה מרגיש כמו למצוא מחט בערימה של שחת. <br> כך הרגשתי אני לפני
					שלוש שנים בערך, כשהחלטתי ללמוד תכנות לבד, <br> אך לצערי לא היה
					לי בלוג כזה שינחה אותי וימנע ממני לבזבז זמן יקר על קורסים מיותרים.
					<br> בדיוק בשל כך אני משתדל לשבת פעם בשנה כדי לבנות לכם את מה
					שהוא לטעמי המסלול הנכון ביותר, <br> היעיל ביותר ובנוסף לכל גם
					די זול, כדי להכשיר את עצמכם כמתכנתים מן המניין. <br> אני מאמין
					שאם תלכו במסלול הזה, תוך שאתם מתרגלים ללא הרף את כל מה שתלמדו, <br>
					תוכלו להגיע לרמה מספקת כדי למצוא את עבודתכם הראשונה כמתכנתים. שלב
					א׳ - האם אני רוצה להיות מתכנת?<br> כתבתי רבות במאמרים שונים
					בבלוג על כמה חשוב שבאמת תאהבו לתכנת, <br> <br>על חשיבות
					התשוקה לדעת עוד ועוד, לשפר ללא הרף את היכולות שלכם כמתכנתים. אני
					באמת ובתמים מאמין שזוהי התכונה החשובה ביותר שיכולה להיות למתכנת.
					לכן, הדבר הראשון שעליכם לעשות הוא <br> להבין אם אתם באמת רוצים
					להיות מתכנתים? האם אתם באמת מוכנים להשקיע את כל הזמן בלימוד תכנות?<br>
					אם מישהו מכם בטוח ברצון שלו להיות מתכנת אז השלב הזה מיותר. אבל לכל
					<br> <br>מי שהספק קיים בליבו, אני מציע לעשות היכרות
					ראשונה עם התחום. אפשרות אחת לכך היא מדריך HTML שכתבתי בעברית אשר
					נועד בעיקר למי שנמצא בדילמה. מי ששוקל להיכנס לתחום אבל מהסס.<br>
					אפשרות נוספת היא פשוט לעבור לשלב הבא ולהתחיל את הקורס המקיף. אתם
					עשויים להרים גבה, שכן <br> <br>הקורס המתואר בשלב הבא
					ארוך, מקיף, מכיל סרטוני וידאו באורך כולל של עשרות שעות ותרגולים <br>שיידרשו
					ממכם אף יותר מכך. ובכן, אתם לא צריכים את כל הקורס בשביל להבין אם
					אתם נמשכים לתכנות או לא. מספיק שתעברו כשעתיים של <br> סרטוני
					וידאו ותרגולים כדי להבין. העלות של הקורס שולית ולכן לא מהווה שיקול
					בעיני.<br> זהו
				</em>
			</p>
		</h3>
	</div>




</body>
</html>